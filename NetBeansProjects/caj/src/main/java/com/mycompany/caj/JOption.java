package com.mycompany.caj;

import javax.swing.JOptionPane;

class JOption {

    public int opciones(int op) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Ver Saldo.\n2.- Depositar.\n3.- Retirar.\n 4.- Salir", "Opciones:", JOptionPane.PLAIN_MESSAGE));
    }

    public void saldoinsuficiente() {
        JOptionPane.showMessageDialog(null, "Saldo insuficiente");
    }

    public void mostrarsaldo(float saldo) {
        JOptionPane.showMessageDialog(null, "Saldo: " + saldo);
    }

    public float depo() {
        return Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la cantidad a depositar: "));
    }
    
    public void retmen(){
        JOptionPane.showMessageDialog(null, "Los retiros deben de ser mayor a $1 ");
    }
    
    public void depmen(){
        JOptionPane.showMessageDialog(null, "Los depositos deben de ser mayo a $1");
    }
}
