/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package com.mycompany.encapsulamientolibro;

/**
 *
 * @author Genaro
 */
public class Libros {
    private String titulo = "El Aleph";
    private String autor = "Jorge Luis Borges";
    private int anioPublicacion = 1939;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public int setAnioPublicacion(int anio) {
        if ((anio <= 2025) && (anio > 0)){
            anioPublicacion = anio;
        }
        return anioPublicacion;
    }
}

