/* Declara dos variables numéricas (con el valor que desees), muestra por 
consola la suma, resta, multiplicación, división y módulo (resto de la 
división). */

package com.mycompany.EjerciciosJava;

public class Ejercicio1 {
    
    public static void main(String[] args){
        
        int num_a = 100;
        int num_b = 50;
        
        System.out.println(num_a + " + " + num_b + " = " + (num_a + num_b));
        System.out.println(num_a + " - " + num_b + " = " + (num_a - num_b));
        System.out.println(num_a + " x " + num_b + " = " + (num_a * num_b));
        System.out.println(num_a + " / " + num_b + " = " + (num_a / num_b));
        System.out.println(num_a + " % " + num_b + " = " + (num_a % num_b));
    }
}