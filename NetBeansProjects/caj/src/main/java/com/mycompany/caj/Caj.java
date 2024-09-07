package com.mycompany.caj;

import javax.swing.JOptionPane;

public class Caj {
    private static Cuenta cuenta;
    private static JOption opciones;

    public static void main(String[] args) {
        opciones = new JOption();
        cuenta = new Cuenta(1500.00f,"Bryan Rivdera",1,"Avenida Federal");
        int op = 0;
        do {
            op = opciones.opciones(op);
            switch (op) {
                case 1:
                    cuenta.consultar();
                    break;
                case 2:
                    cuenta.Depositar();
                    break;
                case 3:
                    cuenta.Retirar(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la cantidad a retirar: ")));
                    break;
                case 4:
                    cuenta.Salir();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (op != 4);
    }
}
