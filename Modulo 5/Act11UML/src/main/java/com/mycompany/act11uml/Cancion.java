/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act11uml;

/**
 *
 * @author Genaro
 */
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    
    
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    
    public String getCancion(){
        return this.titulo;
    }

    
    public String mostrarCancion() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista.mostrarArtista() + '}';
    }
    
    
}
