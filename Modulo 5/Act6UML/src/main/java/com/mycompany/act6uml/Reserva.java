/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act6uml;

/**
 *
 * @author Genaro
 */
public class Reserva {
    private String hora, fecha;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente){
        if (cliente != null){
            this.cliente = cliente;
        }
    }

    public String mostrarReserva() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", mesa=" + mesa.mostrarMesa() + ", cliente=" + cliente.mostrarCliente()+ '}';
    }
    
    
    
}
