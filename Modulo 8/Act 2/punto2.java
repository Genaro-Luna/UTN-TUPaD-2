/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2;

import java.util.Scanner;

/**
 *
 * @author Genaro
 */
public class punto2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un entero: ");
        String texto = input.nextLine();
        try {
            int valor = Integer.parseInt(texto);
            System.out.println("numero ingresado: " + valor);
        } catch (NumberFormatException e) {
            System.err.println("error: no es un entero");
        } finally {
            input.close();
        }
    }
}

