package cuenta;

import javax.swing.*;
import java.util.ArrayList;

public class main {

    private static Cliente cliente1;
    private static Cliente cliente2;
    private static Cliente cliente3;
    private static Cuenta cuenta1;
    private static Cuenta cuenta2;
    private static Cuenta cuenta3;

    public static void main(String[] args) {
        // Registrar cliente
        cliente1 = new Cliente("Lorea");
        Cliente.RegistrarTitular(cliente1);
        cliente2 = new Cliente("Maribel");
        Cliente.RegistrarTitular(cliente2);
        cliente3 = new Cliente("Mario");
        Cliente.RegistrarTitular(cliente3);

        // Registrar cuenta
        cuenta1 = new Cuenta("Cuenta 1");
        Cuenta.RegistrarCuenta(cuenta1);
        cuenta2 = new Cuenta("Cuenta 2");
        Cuenta.RegistrarCuenta(cuenta2);
        cuenta3 = new Cuenta("Cuenta 3");
        Cuenta.RegistrarCuenta(cuenta3);

        // Asignar cuenta 1
        cuenta1.asignarTitular(cliente1);
        cuenta1.asignarTitular(cliente3);

        // Asignar cuenta 2
        cuenta2.asignarTitular(cliente2);
        cuenta2.asignarTitular(cliente1);

        // Asignar cuenta 3
        cuenta3.asignarTitular(cliente2);

        int r;
        Object[] options = {"Lorea", "Maribel", "Mario", "Salir"};
        do {
            r = JOptionPane.showOptionDialog(null, 
                    "Selecciona el cliente", 
                    "Cliente",
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE, 
                    null, 
                    options, 
                    options[0]);

            switch (r) {
                case 0:
                    mostrarCuentas(cliente1);
                    break;
                case 1:
                    mostrarCuentas(cliente2);
                    break;
                case 2:
                    mostrarCuentas(cliente3);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No puedes salir de esta manera");
                    break;
            }
        } while (r != 3);
    }

    private static void mostrarCuentas(Cliente cliente) {
        ArrayList<Cuenta> cuentas = cliente.obtenerCuentasTitular();
        StringBuilder mensaje = new StringBuilder("Cuentas de " + cliente.getNombre() + ":\n");
        for (Cuenta cuenta : cuentas) {
            mensaje.append("Nombre de cuenta: ").append(cuenta.getNombre()).append("\n");
        }

        // Crear un JOptionPane
        JOptionPane optionPane = new JOptionPane(mensaje.toString(), JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION);
        
        // Crear un botón personalizado
        JButton okButton = new JButton("Cerrar sesion");
        okButton.addActionListener(e -> optionPane.setValue(JOptionPane.CLOSED_OPTION));
        
        // Añadir el botón personalizado a JOptionPane
        optionPane.setOptions(new Object[]{okButton});
        
        // Crear un JDialog y personalizarlo
        JDialog dialog = optionPane.createDialog("Información de cuentas");
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }
}
