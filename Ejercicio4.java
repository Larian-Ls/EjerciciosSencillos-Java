/* Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se 
pedirá por teclado. Usa la constante PI y el método pow de Math. */

package com.mycompany.EjerciciosJava;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Radio:")); // Pedir Radio
        double resultado = Math.pow(radio, 2) * Math.PI; // Elevar Radio al cuadrado y multiplicar por PI
        JOptionPane.showMessageDialog(null, resultado); // Imprimir resultado
    }
}