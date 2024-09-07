package carr;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InterfazGrafica {
    private List<Cliente> clientes;
    private List<Producto> catalogo;

    public InterfazGrafica(List<Cliente> clientes, List<Producto> catalogo) {
        this.clientes = clientes;
        this.catalogo = catalogo;
    }

    public void mostrarMenuPrincipal() {
        while (true) {
            String[] opcionesClientes = new String[clientes.size() + 1];
            for (int i = 0; i < clientes.size(); i++) {
                opcionesClientes[i] = clientes.get(i).getNombre() + " - Carro (" + clientes.get(i).getCarro().getItems().size() + ")";
            }
            opcionesClientes[clientes.size()] = "Salir";

            String seleccion = (String) JOptionPane.showInputDialog(null, "Bienvenido a Escomazon", "Menu Principal",
                    JOptionPane.QUESTION_MESSAGE, null, opcionesClientes, opcionesClientes[0]);

            if (seleccion == null || seleccion.equals("Salir")) {
                break;
            }

            for (int i = 0; i < clientes.size(); i++) {
                if (seleccion.equals(opcionesClientes[i])) {
                    mostrarSubmenu(clientes.get(i));
                    break;
                }
            }
        }
    }

    private void mostrarSubmenu(Cliente cliente) {
        while (true) {
            String[] opcionesSubmenu = {"Mostrar Carro", "Agregar al Carro", "Vaciar el Carro", "Hacer Pedido", "Log Out"};
            String seleccion = (String) JOptionPane.showInputDialog(null, cliente.getNombre() + " - Carro (" + cliente.getCarro().getItems().size() + ")",
                    "Submenu", JOptionPane.QUESTION_MESSAGE, null, opcionesSubmenu, opcionesSubmenu[0]);

            if (seleccion == null || seleccion.equals("Log Out")) {
                break;
            }

            switch (seleccion) {
                case "Mostrar Carro":
                    mostrarCarro(cliente);
                    break;
                case "Agregar al Carro":
                    agregarAlCarro(cliente);
                    break;
                case "Vaciar el Carro":
                    cliente.getCarro().vaciarCarro();
                    JOptionPane.showMessageDialog(null, "El carro ha sido vaciado.");
                    break;
                case "Hacer Pedido":
                    hacerPedido(cliente);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }

    private void mostrarCarro(Cliente cliente) {
        Carro carro = cliente.getCarro();
        StringBuilder mensaje = new StringBuilder("Carro:\n");
        for (int i = 0; i < carro.getItems().size(); i++) {
            ITEM item = carro.getItems().get(i);
            mensaje.append((i + 1)).append(". Producto: ").append(item.getProducto().getNombre())
                    .append(", Cantidad: ").append(item.getCantidad()).append("\n");
        }
        if (carro.getItems().isEmpty()) {
            mensaje.append("El carro está vacío.\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());

        mostrarSubmenuMostrarCarro(cliente);
    }

    private void mostrarSubmenuMostrarCarro(Cliente cliente) {
        while (true) {
            String[] opciones = {"Quitar algún producto", "Cambiar la cantidad de algún producto", "Regresar"};
            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Submenu Carro",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion == null || seleccion.equals("Regresar")) {
                break;
            }

            switch (seleccion) {
                case "Quitar algún producto":
                    quitarProductoDelCarro(cliente);
                    break;
                case "Cambiar la cantidad de algún producto":
                    cambiarCantidadProducto(cliente);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }

    private void quitarProductoDelCarro(Cliente cliente) {
        String indiceStr = JOptionPane.showInputDialog("Ingrese el índice del producto a quitar:");
        int indiceQuitar = Integer.parseInt(indiceStr) - 1;
        if (indiceQuitar >= 0 && indiceQuitar < cliente.getCarro().getItems().size()) {
            ITEM itemAQuitar = cliente.getCarro().getItems().get(indiceQuitar);
            cliente.getCarro().quitarItem(itemAQuitar);
            JOptionPane.showMessageDialog(null, "Producto quitado del carro.");
        } else {
            JOptionPane.showMessageDialog(null, "Índice no válido.");
        }
    }

    private void cambiarCantidadProducto(Cliente cliente) {
        String indiceStr = JOptionPane.showInputDialog("Ingrese el índice del producto a cambiar:");
        int indiceCambiar = Integer.parseInt(indiceStr) - 1;
        if (indiceCambiar >= 0 && indiceCambiar < cliente.getCarro().getItems().size()) {
            String cantidadStr = JOptionPane.showInputDialog("Ingrese la nueva cantidad:");
            int nuevaCantidad = Integer.parseInt(cantidadStr);
            ITEM itemACambiar = cliente.getCarro().getItems().get(indiceCambiar);
            if (nuevaCantidad <= itemACambiar.getProducto().getStock() + itemACambiar.getCantidad()) {
                itemACambiar.getProducto().incrementarStock(itemACambiar.getCantidad()); // Revertir la cantidad previa
                itemACambiar.setCantidad(nuevaCantidad);
                itemACambiar.getProducto().reducirStock(nuevaCantidad);
                JOptionPane.showMessageDialog(null, "Cantidad actualizada.");
            } else {
                JOptionPane.showMessageDialog(null, "No hay suficiente stock para la nueva cantidad.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Índice no válido.");
        }
    }

    private void agregarAlCarro(Cliente cliente) {
        StringBuilder mensaje = new StringBuilder("Catálogo de productos:\n");
        for (int i = 0; i < catalogo.size(); i++) {
            Producto producto = catalogo.get(i);
            mensaje.append((i + 1)).append(". ").append(producto.getNombre())
                    .append(" - Precio: ").append(producto.getPrecio())
                    .append(" - Stock: ").append(producto.getStock()).append("\n");
        }
        String indiceStr = JOptionPane.showInputDialog(mensaje.toString() + "Ingrese el índice del producto a agregar:");
        int indiceProducto = Integer.parseInt(indiceStr) - 1;
        if (indiceProducto >= 0 && indiceProducto < catalogo.size()) {
            Producto productoSeleccionado = catalogo.get(indiceProducto);
            String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad:");
            int cantidad = Integer.parseInt(cantidadStr);
            if (cantidad <= productoSeleccionado.getStock()) {
                ITEM nuevoItem = new ITEM(productoSeleccionado, cantidad);
                cliente.getCarro().agregarItem(nuevoItem);
                JOptionPane.showMessageDialog(null, "Producto agregado al carro.");
            } else {
                JOptionPane.showMessageDialog(null, "No hay suficiente stock para la cantidad solicitada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Índice no válido.");
        }
    }

    private void hacerPedido(Cliente cliente) {
        Carro carro = cliente.getCarro();
        double total = 0;
        StringBuilder descripcion = new StringBuilder("Descripción del Pedido:\n");
        for (ITEM item : carro.getItems()) {
            double subtotal = item.getCantidad() * item.getProducto().getPrecio();
            total += subtotal;
            descripcion.append(item.getProducto().getNombre()).append(" - Precio unitario: ")
                    .append(item.getProducto().getPrecio()).append(" - Cantidad: ")
                    .append(item.getCantidad()).append(" - Subtotal: ").append(subtotal).append("\n");
        }
        descripcion.append("Total = ").append(total);
        JOptionPane.showMessageDialog(null, descripcion.toString());
        carro.vaciarCarro();
        JOptionPane.showMessageDialog(null, "Pedido realizado. El carro ha sido vaciado.");
    }
}

