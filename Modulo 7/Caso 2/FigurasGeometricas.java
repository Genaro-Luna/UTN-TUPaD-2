/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figurasgeometricas;

import java.util.ArrayList;

/**
 *
 * @author Genaro
 */
public class FigurasGeometricas {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        figuras.add(new Circulo(3, "Circulo"));
        figuras.add(new Rectangulo(2, 5, "Rectagulo"));
        figuras.add(new Circulo(6, "Circulo"));
        figuras.add(new Rectangulo(4, 7, "Rectangulo"));
        
        for (Figura figura : figuras) {
            System.out.println(figura.calcularArea());
        }
    }
}
