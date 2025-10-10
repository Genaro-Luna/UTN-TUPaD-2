/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulo6;

import java.util.ArrayList;

/**
 *
 * @author Genaro
 */
public class Inventario {
    ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    
    public void agregarProducto(Producto p){
        this.productos.add(p);
    }
    
    
    public void listarProductos(){
        for (Producto i : productos) {
            System.out.println(i.mostrarInfo());
        }
    }
    
    
    public Producto buscarProductoPorId(String id){
        Producto producto = null;
        for (Producto i : productos) {
            if (i.getId() == id){
                producto = i;
            }
        }
        return producto;
    }
    
    
    public void eliminarProducto(String id){
        Producto prodABorrar = buscarProductoPorId(id);
        this.productos.remove(prodABorrar);
    }
    
    
    public void actualizarStock(String id, int nuevaCantidad){
        Producto prodActualizar = buscarProductoPorId(id);
        prodActualizar.setCantidad(nuevaCantidad);
    }
    
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> prodPorCategoria = new ArrayList<>();
        for (Producto i : productos) {
            if (i.getCategoria() == categoria){
                prodPorCategoria.add(i);
            }
        }
        return prodPorCategoria;
    }
    
    
    public int obtenerTotalStock(){
        int total = 0;
        for (Producto p : productos) {
            total = total + p.getCant();
        }
        return total;
    }
    
    
    public Producto obtenerProductoConMayorStock(){
        Producto prodMayorStock = productos.get(0);
        for (int i = 1; i < productos.size(); i++) {
            if(productos.get(i).getCant() > prodMayorStock.getCant()){
                prodMayorStock = productos.get(i);
            }
        }
        return prodMayorStock;
    }
    
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        ArrayList<Producto> prodEnRango = new ArrayList<>();
        for (Producto p : productos) {
            if(p.getPrecio() >= min && p.getPrecio() <= max){
                prodEnRango.add(p);
            }
        }
        return prodEnRango;
    }
    
    
    public void mostrarCategoriasDisponibles(){
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat.name() + ": " + cat.getDescripcion());
        }
    }
}
