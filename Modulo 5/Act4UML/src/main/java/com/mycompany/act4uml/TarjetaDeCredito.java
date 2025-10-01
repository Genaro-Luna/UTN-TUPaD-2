/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act4uml;

/**
 *
 * @author Genaro
 */
public class TarjetaDeCredito {
    private int numero, fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(int numero, int fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjeta() != this){
            cliente.setTarjeta(this);
        }
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String mostrarTarjeta() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", cliente=" + cliente.getNombre() + ", banco=" + banco.getNombre() + '}';
    }
    
    
    
}
