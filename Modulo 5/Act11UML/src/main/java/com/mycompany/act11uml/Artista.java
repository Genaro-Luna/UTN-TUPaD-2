/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act11uml;

/**
 *
 * @author Genaro
 */
public class Artista {
    private String nombre, genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String mostrarArtista() {
        return "Artista{" + "nombre=" + nombre + ", genero=" + genero + '}';
    }
    
    
}
