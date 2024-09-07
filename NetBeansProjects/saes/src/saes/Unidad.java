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
public class Unidad {
    private int id;
    private int NumCred;
    private String Nombre;
    private Joption opciones = new Joption();
    
    public Unidad(int id, int NumCred, String Nombre){
        this.id = id;
        this.NumCred = NumCred;
        this.Nombre = Nombre;
    }
    
    public void getIdUnidad(){
        opciones.mostrarIdUnidad(this.id);
    }
    
    public void getNumCred(){
        opciones.mostrarCreditos(this.NumCred);
    }
    public void getnombre(){
        opciones.mostrarNombre(this.Nombre);
    }
    
}
