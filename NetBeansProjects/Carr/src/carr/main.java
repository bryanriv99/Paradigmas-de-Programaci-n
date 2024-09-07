package carr;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Producto> catalogo = new ArrayList<>();

        // Crear productos y agregarlos al catálogo
        catalogo.add(new Producto("Laptop", 1000.0, 20));
        catalogo.add(new Producto("Mouse", 25.0, 30));
        catalogo.add(new Producto("Teclado", 45.0, 25));
        catalogo.add(new Producto("Monitor", 150.0, 10));
        catalogo.add(new Producto("Impresora", 200.0, 15));
        catalogo.add(new Producto("Cámara", 300.0, 12));
        catalogo.add(new Producto("Altavoz", 50.0, 40));
        catalogo.add(new Producto("Micrófono", 75.0, 35));
        catalogo.add(new Producto("Disco Duro", 80.0, 50));
        catalogo.add(new Producto("Memoria USB", 20.0, 45));

        // Crear clientes
        Cliente cliente1 = new Cliente("Luis Garcia", "luis@correo.com");
        Cliente cliente2 = new Cliente("Maria Lopez", "maria@correo.com");
        Cliente cliente3 = new Cliente("Carlos Martinez", "carlos@correo.com");

        // Asignar carros a los clientes
        cliente1.setCarro(new Carro(1001, "Carro de Luis"));
        cliente2.setCarro(new Carro(1002, "Carro de Maria"));
        cliente3.setCarro(new Carro(1003, "Carro de Carlos"));

        // Agregar clientes a la lista
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        // Iniciar la interfaz gráfica
        InterfazGrafica interfaz = new InterfazGrafica(clientes, catalogo);
        interfaz.mostrarMenuPrincipal();
    }
}
