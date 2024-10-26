/* Modifica la aplicación anterior, para que nos pida el nombre que queremos 
introducir */

package com.mycompany.EjerciciosJava;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    
    public static void main(String[] args){
        
        String nombre = JOptionPane.showInputDialog("Introuzca su nombre:");
        JOptionPane.showMessageDialog(null,"Bienvenid@, " + nombre);
    }
}
