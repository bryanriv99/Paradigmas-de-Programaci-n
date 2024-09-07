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
public class Profesor {
    private int NumTrab;
    private String Departamento;
    private String Nombre;
    private Joption opciones = new Joption();
    
    public Profesor(int NumTrab, String Departamento, String Nombre){
        this.NumTrab = NumTrab;
        this.Departamento = Departamento;
        this.Nombre = Nombre;
    }
    
   public void getNumTrab(){
       opciones.mostrarNumTrab(this.NumTrab);
   }
   
   public void getDepartamento(){
       opciones.mostrarDep(this.Departamento);
   }
   
   public void getNombre(){
       opciones.mostrarNomProf(this.Nombre);
   }
}
