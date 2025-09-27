/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tabla.multiplicar;

/**
 *
 * @author Owner
 */
public class TablaMultiplicar {
    public static void main(String[] args) {
        int numero = 5;
        
        System.out.println("Tabla de multiplicar del " +numero+ ":");
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero+ " x " +i+ " = " +resultado );
        }
    }
    
}
