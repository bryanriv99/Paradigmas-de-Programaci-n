/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saes;

import javax.swing.JOptionPane;

/**
 *
 * @author BRP
 */
public class Horario {
    private String hora;
    private String dia;
    private Joption opciones = new Joption();
    
    public Horario(String hora, String dia){
        this.hora = hora;
        this.dia = dia;
    }
    
    public void gethora(){
        opciones.mostrarhora(this.hora);
    }
    
    public void getdia(){
        opciones.mostrardia(this.dia);
    }
}
