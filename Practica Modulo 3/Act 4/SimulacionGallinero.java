/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simulaciongallinero;

/**
 *
 * @author Genaro
 */
public class SimulacionGallinero {

    public static void main(String[] args) {
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();
        
        //Primera gallina
        g1.setIdGallina(43);
        g1.setEdad(2);
        g1.setPonerHuevos(320);
        //Segunda gallina
        g2.setIdGallina(21);
        g2.setEdad(3);
        g2.setPonerHuevos(600);
        
        //Mostramos su estado actual
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        //Hacemos que envejescan y pongan huevos y mostramos su resultado
        g1.envejecer();
        g1.setPonerHuevos(300);
        g2.envejecer();
        g2.setPonerHuevos(250);
        
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
