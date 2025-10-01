/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act6uml;

/**
 *
 * @author Genaro
 */
public class Act6UML {

    public static void main(String[] args) {
        Mesa mesa = new Mesa(13, 8);
        Reserva reserva = new Reserva("7/10", "21:00", mesa);
        Cliente cliente = new Cliente("Genaro", 343);
        
        reserva.setCliente(cliente);
        System.out.println(reserva.mostrarReserva());
    }
}
