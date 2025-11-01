/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.actividad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Genaro
 */
public class punto5 {

    public static void main(String[] args) {
        String ruta = "src\\main\\java\\com\\mycompany\\actividad2\\prueba.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error de lectura leyendo el archivo: " + e.getMessage());
        }

    }
}
