/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2;

import java.util.Scanner;

/**
 *
 * @author Genaro
 */
public class punto1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese dividendo: ");
        int a = input.nextInt();
        System.out.print("Ingrese divisor: ");
        int b = input.nextInt();

        try {
            double resto = dividir(a, b);
            System.out.println("Resultado: " + resto);
        } catch (ArithmeticException e) {
            System.err.println("Error: el divisor es cero");
        } finally {
            input.close();
        }

    }
    
    public static double dividir(int a, int b) {
        return a / (double) b;
    }
}

