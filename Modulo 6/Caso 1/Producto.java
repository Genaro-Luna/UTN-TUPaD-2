/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulo6;

/**
 *
 * @author Genaro
 */
public class Producto {
    private String id, nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }
    
    public CategoriaProducto getCategoria(){
        return this.categoria;
    }

    public int getCant() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    public void setCantidad(int cantidad) {
        if(cantidad >= 0){
            this.cantidad = cantidad;
        }
    }

    public String mostrarInfo() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }
}
