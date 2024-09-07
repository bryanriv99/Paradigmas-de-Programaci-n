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
public class Clase {
    private int id;
    private Horario horario;
    private int Salon;
    private Joption opciones = new Joption();
    
    public Clase(int id, int Salon, String dia, String hora){
        this.id = id;
        this.Salon = Salon;
        this.horario = new Horario(dia,hora);
    }
    
    public void getIdClase(){
        opciones.mostrarIdClase(this.id);
    }
    
    public void getSalon(){
        opciones.mostrarSalon(this.Salon);
    }

    public void gerhorario(){
        horario.getdia();
        horario.gethora();
    }
}
