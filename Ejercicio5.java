/* Lee un número por teclado y muestra por consola, el carácter al que 
pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, 
me muestre una a. */

package com.mycompany.EjerciciosJava;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Número: ")); // Pedir entero
        char ascii_char = (char)num; // Guardar valor ASCII correspondiente  
        JOptionPane.showMessageDialog(null, ascii_char); // Imprimir valor
    }
}