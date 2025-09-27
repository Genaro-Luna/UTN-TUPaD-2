/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act1uml;

/**
 *
 * @author Genaro
 */
public class Act1UML {

    public static void main(String[] args) {
        Pasaporte pasaporte = new Pasaporte(123421, "mi cara", "1:4", "25/05/2009");
        Titular titular = new Titular("Genaro", 44369231);
        titular.setPasaporte(pasaporte);
        System.out.println("Dtos del pasaporte:\n" + pasaporte.mostarPasaporte());
        System.out.println("------------------------------------------");
        System.out.println("Dtos del titular:\n" + titular.mostrarTitular());
        
        System.out.println(pasaporte.mostrarFoto());
    }
}
