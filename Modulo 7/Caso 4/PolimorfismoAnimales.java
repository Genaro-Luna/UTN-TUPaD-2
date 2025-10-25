/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animales;

import java.util.ArrayList;

/**
 *
 * @author Genaro
 */
public class PolimorfismoAnimales {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Kira"));
        animales.add(new Gato("Miel"));
        animales.add(new Vaca("Lola"));
        
        for (Animal animal : animales) {
            animal.mostrarAnimal();
            animal.hacerSonido();
        }
    }
}
