/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.actividad2;

import java.util.Scanner;

/**
 *
 * @author Genaro
 */
public class punto4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese edad: ");
        int edad = input.nextInt();
        try {
            validarEdad(edad);
            System.out.println("Edad valida: " + edad);
        } catch (EdadInvalidaException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera de rango: " + edad);
        }
    }
}
