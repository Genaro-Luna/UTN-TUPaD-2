/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacesjava;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Genaro
 */

public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private Notificable cliente;
    private Estado estado = Estado.CREADO;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    @Override
    public double calcularTotal(){
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public void cambiarEstado(Estado nuevoEstado){
        this.estado = nuevoEstado;
        if (cliente != null){
            cliente.notificar("El pedido cambió a estado: " + nuevoEstado);
        }
    }

    public Estado getEstado(){
        return estado;
    }
    
    public List<Producto> getProductos(){
        return productos;
    }
}
