/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Genaro
 */
public class punto3 {

    public static void main(String[] args) {
        File archivo = new File("src\\main\\java\\com\\mycompany\\actividad2\\prueba.txt");
        try (Scanner input = new Scanner(archivo)) {
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + archivo.getPath());
        }

    }
}

