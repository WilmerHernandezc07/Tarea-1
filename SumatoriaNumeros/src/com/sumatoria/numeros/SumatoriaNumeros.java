/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sumatoria.numeros;

/**
 *
 * @author Owner
 */
public class SumatoriaNumeros {
    public static void main(String[] args) {
        int i = 1;
        int suma = 0;

        do {
            suma = suma + i;
            i++;
        } while (i <= 50);

        System.out.println("La suma es: " + suma);
    }
}
