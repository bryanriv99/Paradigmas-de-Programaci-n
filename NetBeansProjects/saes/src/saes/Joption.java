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
public class Joption {
    
    //mostrar
    public void mostrarIdUnidad(int uni){
        JOptionPane.showMessageDialog(null, "Id de la unidad de Aprendizaje: " + uni);
    }
    
    public void mostrarCreditos(int cred){
        JOptionPane.showMessageDialog(null, "La cantidad de Creditos es: " + cred);
    }
    
    public void mostrarNombre(String Nom){
        JOptionPane.showMessageDialog(null, "El nombre de la unidad es: " + Nom);
    }
    
    public void mostrarNumTrab(int num){
        JOptionPane.showMessageDialog(null, "El numero del trabajador es: " + num);
    }
    
    public void mostrarDep(String Dep){
        JOptionPane.showMessageDialog(null, "El Departamento del profesor es: " + Dep);
    }
    
    public void mostrarNomProf(String Prof){
        JOptionPane.showMessageDialog(null, "El Nombre del profesor es: " + Prof);
    }
    
    public void mostrarIdClase(int IDc){
        JOptionPane.showMessageDialog(null, "El Id de la clase es: " + IDc);
    }
    
    public void mostrarSalon(int salon){
        JOptionPane.showMessageDialog(null, "El Salon de la clase es: " + salon);
    }
    
    public void mostrarhora(String hor){
        JOptionPane.showMessageDialog(null, "La Hora de la clase es: " + hor);
    }
    
    public void mostrardia(String dias){
        JOptionPane.showMessageDialog(null, "Los dias de clase son: " + dias);
    }
}
