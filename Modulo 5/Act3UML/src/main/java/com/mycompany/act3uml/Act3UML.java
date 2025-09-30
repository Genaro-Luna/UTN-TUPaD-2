/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act3uml;

/**
 *
 * @author Genaro
 */
public class Act3UML {

    public static void main(String[] args) {
        Editorial editorial = new Editorial("Las espadas", "Bs As");
        Libro libro = new Libro("El Aleph", "3423", editorial);
        Autor autor = new Autor("Jorge L. Borges", "Argentina");
        
        libro.setAutor(autor);
        System.out.println("Mostramos los datos de los objetos creados:");
        System.out.println(editorial.mostrarEditorial());
        System.out.println(libro.mostrarLibro());
        System.out.println(autor.mostarAutor());
    }
}
