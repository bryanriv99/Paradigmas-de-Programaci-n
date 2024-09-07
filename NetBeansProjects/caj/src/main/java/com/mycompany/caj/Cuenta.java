package com.mycompany.caj;

import javax.swing.JOptionPane;

public class Cuenta {

    private float saldo;
    private String nombre;
    private int id;
    private String Direccion;
    private JOption opciones = new JOption();

    public Cuenta(float saldo,String nombre,int id,String Direccion) {
        this.saldo = saldo;
        this.nombre = nombre;
        this.id = id;
        this.Direccion = Direccion;
    }

    public void consultar() {
        if (this.saldo > 999) {
            opciones.mostrarsaldo(saldo);
        } else {
            this.saldo -= 30.50;
            opciones.mostrarsaldo(saldo);
        }
    }

    public void Depositar() {
        float deposito = opciones.depo();
        if(deposito>0){
            this.saldo += deposito;
            opciones.mostrarsaldo(this.saldo);
        }else{
            opciones.depmen();
        }
    }

    public void Retirar(float retiro) {
        if(retiro < 0){
            opciones.retmen();
        }else if(this.saldo>999){
            if (retiro > this.saldo) {
                opciones.saldoinsuficiente();
                opciones.mostrarsaldo(this.saldo);
            } else {
                this.saldo -= retiro;
                opciones.mostrarsaldo(this.saldo);
            }
        }else{
            if (retiro > this.saldo) {
                opciones.saldoinsuficiente();
                this.saldo -= 30.50;
                opciones.mostrarsaldo(this.saldo);
            } else {
                this.saldo -= retiro;
                this.saldo -= 30.50;
                opciones.mostrarsaldo(this.saldo);
            }
        }
    }

    public void Salir() {
        System.exit(0);
    }
}