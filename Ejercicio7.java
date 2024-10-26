/* Lee un número por teclado que pida el precio de un producto (puede tener 
decimales) y calcule el precio final con IVA. El IVA sera una constante que 
sera del 21%. */

package com.mycompany.EjerciciosJava;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args){
        double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Precio: "));
        double iva = price * 0.21;
        JOptionPane.showMessageDialog(null, "Precio: " + price); // Precio normal
        JOptionPane.showMessageDialog(null, "Precio con IVA: " + (price + iva)); // Precio + IVA
    }
}

