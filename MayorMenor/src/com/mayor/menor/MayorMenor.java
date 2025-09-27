/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mayor.menor;

/**
 *
 * @author Owner
 */
public class MayorMenor {
    public static void main(String[] args) {
        int num1 = 57;
        int num2 = 26;
        
        if (num1 > num2) {
            System.out.println("El mayor es: " +num1);
            System.out.println("El menor es: " +num2);
        }else if (num2 > num1) {
            System.out.println("El mayor es: " +num2);
            System.out.println("El menor es: " +num1);
        }else {
            System.out.println("Ambos numeros son iguales: " +num1);
        }
    }
    
}
