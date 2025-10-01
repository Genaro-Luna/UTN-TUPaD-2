/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act5uml;

/**
 *
 * @author Genaro
 */
public class Act5UML {

    public static void main(String[] args) {
        Computadora compu = new Computadora("PCBOX", "893-23", "B550", "AMD");
        Propietario propietario = new Propietario("Genaro", 44369231);
        compu.setPropietario(propietario);
        
        System.out.println("Mostramos los datos de las clases");
        System.out.println(compu.mostrarCompu());
        System.out.println(propietario.mostrarPropietario());
        System.out.println("Mostramos datos individuales de la placa");
        System.out.println(compu.getPlaca().getModelo());
        System.out.println(compu.getPlaca().getChipset());
        System.out.println("Ahora hacemos null Computadora y mostramos lo que devuelve");
        compu = null;
        System.out.println(propietario.mostrarPropietario());
        System.out.println(compu); 
        // System.out.println(compu.getPlaca().mostrarPlaca());
        // Esa lina dara un error al momento de ejecutarse ya que el dar el valor
        //-null a compu, PlacaMadre se elimina
    }
}
