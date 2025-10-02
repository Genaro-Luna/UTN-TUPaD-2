/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act7uml;

/**
 *
 * @author Genaro
 */
public class Act7UML {

    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "12345");
        Vehiculo vehiculo = new Vehiculo("AB184DEU", "2019", motor);
        Conductor conductor = new Conductor("Genaro", "B2-A2");
        
        vehiculo.setConductor(conductor);
        System.out.println("Mostramos los datos:");
        System.out.println(vehiculo.mostrarVehiculo());
    }
}
