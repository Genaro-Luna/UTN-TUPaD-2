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
    
    private Libros() {
    }
    
    public static Libros getInstance() {
        return LibrosHolder.INSTANCE;
    }
    
    private static class LibrosHolder {

        private static final Libros INSTANCE = new Libros();
    }
}
