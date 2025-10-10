/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caso2;

import java.util.ArrayList;

/**
 *
 * @author Genaro
 */
public class Caso2 {

    public static void main(String[] args) {
        //Punto 1
        Biblioteca biblioteca = new Biblioteca("Mariano Moreno");
        //Punto 2
        Autor a1 = new Autor("1", "Jorge Luis Borges", "Argentina");
        Autor a2 = new Autor("2", "Julio Cortazar", "Argentina");
        Autor a3 = new Autor("3", "William Shakespeare", "Inglaterra");
        
        //Punto 3
        biblioteca.agregarLibro("1234", "El Aleph", 1949, a1);
        biblioteca.agregarLibro("4321", "Rayuela", 1963, a2);
        biblioteca.agregarLibro("0123", "Ficciones", 1944, a1);
        biblioteca.agregarLibro("0246", "Libro 3", 1949, a1);
        biblioteca.agregarLibro("2468", "Hamlet", 1623, a3);
        biblioteca.agregarLibro("7901", "Libro 2", 1949, a1);
        biblioteca.agregarLibro("1357", "Romeo y Julieta", 1597, a3);
        biblioteca.agregarLibro("9876", "Bestiario", 1951, a2);
        biblioteca.agregarLibro("2112", "Libro 1", 1949, a1);
        biblioteca.agregarLibro("0101", "Final del juego", 1956, a2);
        
        //Punto 4
        for (Libro libro : biblioteca.libros) {
            System.out.println(libro.mostrarInfo());
            System.out.println("|||||||||||||||||||||");
        }
        System.out.println("");
        //Punto 5
        System.out.println(biblioteca.buscarLibroPorIsbn("0123").mostrarInfo());
        System.out.println("");
        //Punto 6
        biblioteca.filtrarLibrosPorAnio(1949);
        ArrayList<Libro> libPorAnio = biblioteca.filtrarLibrosPorAnio(1949);
        for (Libro lib : libPorAnio) {
            System.out.println(lib.mostrarInfo());
        }
        
        
        //Punto 7
        biblioteca.eliminarLibro("0246");
        biblioteca.eliminarLibro("2112");
        biblioteca.eliminarLibro("0101");
        System.out.println("");
        
        for (Libro libro : biblioteca.libros) {
            System.out.println(libro.mostrarInfo());
            System.out.println("|||||||||||||||||||||");
        }
        
        System.out.println("");
        //Punto 8
        System.out.println(biblioteca.obtenerCantidadLibros() + " Libros disponibles");
        
        //Punto 9
        System.out.println("");
        for (Autor autor : biblioteca.mostrarAutoresDisponibles()) {
            System.out.println(autor.mostrarInfo());
        }
    }
}
