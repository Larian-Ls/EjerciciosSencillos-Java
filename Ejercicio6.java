/* Modifica el ejercicio anterior, para que en lugar de pedir un número, pida 
un carácter (char) y muestre su código en la tabla ASCII. */

package com.mycompany.EjerciciosJava;

import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog(null, "ASCII: "); // Pedir caracter
        
        if (input != null && input.length() == 1){ // Si hay más de un valor
        char ascii = input.charAt(0); //Convertir el String a su caracter ASCII
        int num = (int) ascii; // Traducir el caracter ASCII a entero
        JOptionPane.showMessageDialog(null, num); // Imprimir valor   
        } else { // Mensaje de error
            JOptionPane.showMessageDialog(null, "Introduzca un solo valor");
        }

    }
}