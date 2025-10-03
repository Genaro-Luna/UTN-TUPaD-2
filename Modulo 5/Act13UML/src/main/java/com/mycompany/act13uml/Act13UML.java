/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act13uml;

/**
 *
 * @author Genaro
 */
public class Act13UML {

    public static void main(String[] args) {
        Usuario user = new Usuario("Genaro", "genaroluna2808@gmail.com");
        GeneradorQR codigo = new GeneradorQR();
        codigo.generar("32", user);
    }
}
