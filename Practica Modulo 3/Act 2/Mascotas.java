/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package com.mycompany.registromascotas;

/**
 *
 * @author Genaro
 */
public class Mascotas {
    String nombre = "Bomber", especie = "Dalmata";
    int edad = 4;


    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Especie: "+especie);
        System.out.println("Edad: "+edad);
    }
    
    public void cumplirAnios(){
        edad += 1;
    }
}

