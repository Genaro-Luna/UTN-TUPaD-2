/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caso2;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Genaro
 */
public class Biblioteca {
    private String nombre;
    List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre; 
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    
    
    public ArrayList<Libro> listarLibros(){
        ArrayList<Libro> listLibros = new ArrayList<>();
        for (Libro libro : libros) {
            listLibros.add(libro);
        }
        return listLibros;
    }
    
    
    public Libro buscarLibroPorIsbn(String isbn){
        int i = 0;
        while(i < libros.size() && !libros.get(i).getIsbn().equals(isbn)){
            i++;
        }
        return libros.get(i);
    }
    
    
    public void eliminarLibro(String isbn){
        Libro libABorrar = buscarLibroPorIsbn(isbn);
        libros.remove(libABorrar);
    }
    
    
    public int obtenerCantidadLibros(){
        int total = 0;
        for (int i = 0; i < listarLibros().size(); i++) {
            total = i + 1;
        }
        return total;
    }
    
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio){
        ArrayList<Libro> libPorAnio = new ArrayList<>();
        for (Libro libro : libros) {
            if(libro.getAnioPublicacion() == anio){
                libPorAnio.add(libro);
            }
        }
        return libPorAnio;
    }
    
    
    public ArrayList<Autor> mostrarAutoresDisponibles(){
        ArrayList<Autor> autores = new ArrayList<>();
        for (Libro libro : libros) {
            Autor autAnterior = libro.getAutor();
            if(!autores.contains(autAnterior)){
                autores.add(autAnterior);
            }
        }
        return autores;
    }
}
