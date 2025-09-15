/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulamientolibro;

/**
 *
 * @author Genaro
 */
public class EncapsulamientoLibro {

    public static void main(String[] args) {
        Libros libro = new Libros();
        String titulo = libro.getTitulo();
        String autor = libro.getAutor();
        int anio = libro.getAnioPublicacion();
        System.out.println("Libro: "+titulo+" - Autor: "+autor);
        System.out.println("Anio publicacion: "+anio);
        //Anio erroneo, lo corregimos con un valor invalido y mostramos lo que devuelve
        anio = libro.setAnioPublicacion(2026);
        System.out.println("Anio publicacion: "+anio);
        //No se modifica devido a que la condicion pide que sea entre el 2025 y 0 sin inlcuir el ultimo
        anio = libro.setAnioPublicacion(1949);
        //Ahora si le dimos un valor valido y en este caso el anio correcto de publicacion
        System.out.println("-------------------------------");
        System.out.println("Anio de publicacion corregido");
        System.out.println("-------------------------------");
        System.out.println("Libro: "+titulo+" - Autor: "+autor);
        System.out.println("Anio publicacion: "+anio);
    }
}
