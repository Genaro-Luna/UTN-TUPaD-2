/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act3uml;

/**
 *
 * @author Genaro
 */
public class Libro {
    private String titulo, sibn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String sibn, Editorial editorial) {
        this.titulo = titulo;
        this.sibn = sibn;
        this.editorial = editorial;
    }
    
    public void setAutor(Autor autor){
        if (autor != null){
            this.autor = autor;
        } else {
            System.out.println("El valor es nulo");
        }
    }

    public String mostrarLibro() {
        return "Libro: Titulo: " + titulo + ", sibn: " + sibn + ", Autor: " + autor.getNombre() + ", Editorial: " + editorial.getNombre();
    }
    
    
    
}
