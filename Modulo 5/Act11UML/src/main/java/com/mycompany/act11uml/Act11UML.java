/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act11uml;

/**
 *
 * @author Genaro
 */
public class Act11UML {

    public static void main(String[] args) {
        Cancion cancion = new Cancion("9 de Julio");
        Artista artista = new Artista("Callejeros", "Rock");
        Reproductor reproductor = new Reproductor();
        
        cancion.setArtista(artista);
        
        reproductor.reproducir(cancion);
    }
}
