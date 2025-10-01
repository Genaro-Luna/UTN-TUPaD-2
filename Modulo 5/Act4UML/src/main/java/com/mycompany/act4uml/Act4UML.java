/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act4uml;

/**
 *
 * @author Genaro
 */
public class Act4UML {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Genaro", 44369231);
        Banco banco = new Banco("Banco Entre Rios", 2043564043);
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(345235543, 2032, banco);
        
        tarjeta.setCliente(cliente);
        
        System.out.println(tarjeta.mostrarTarjeta());
        System.out.println(cliente.mostrarCliente());
        System.out.println(banco.toString());
        
        tarjeta = null;
        
        System.out.println("Con tarjeta NULL");
        System.out.println(cliente.mostrarCliente());
        System.out.println(banco.toString());
    }
}
