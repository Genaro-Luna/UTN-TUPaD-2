/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modulo6;

import java.util.ArrayList;

/**
 *
 * @author Genaro
 */
public class Modulo6 {

    public static void main(String[] args) {
    //Punto 1
    Inventario inventario = new Inventario();
    
    Producto p1 = new Producto("1234", "Remera", 1500, 10, CategoriaProducto.ROPA);
    Producto p2 = new Producto("2468", "Yougurt", 500, 33, CategoriaProducto.ALIMENTOS);
    Producto p3 = new Producto("1357", "Mesa", 3000, 5, CategoriaProducto.HOGAR);
    Producto p4 = new Producto("4321", "Pava electica", 1000, 15, CategoriaProducto.ELECTRONICA);
    Producto p5 = new Producto("3579", "Pantalon", 800, 25, CategoriaProducto.ROPA);
    Producto p6 = new Producto("4680", "Milanesa", 300, 52, CategoriaProducto.ALIMENTOS);
    Producto p7 = new Producto("0123", "Notebook", 1400, 12, CategoriaProducto.ELECTRONICA);
    Producto p8 = new Producto("4343", "Campera", 1000, 15, CategoriaProducto.ROPA);
    
     inventario.agregarProducto(p1);
     inventario.agregarProducto(p2);
     inventario.agregarProducto(p3);
     inventario.agregarProducto(p4);
     inventario.agregarProducto(p5);
     inventario.agregarProducto(p6);
     inventario.agregarProducto(p7);
     inventario.agregarProducto(p8);
     
    //Punto 2:
        System.out.println("Listar productos:");
    inventario.listarProductos();
    
    //Punto 3:
        System.out.println("Buscar y mostrar productos:");
    System.out.println(inventario.buscarProductoPorId("1234").mostrarInfo());
    System.out.println(inventario.buscarProductoPorId("4321").mostrarInfo());
    System.out.println(inventario.buscarProductoPorId("2468").mostrarInfo());
    System.out.println(inventario.buscarProductoPorId("1"));
    
    //Punto 4
        System.out.println("Mostrar por categoria, en este caso ROPA");
    ArrayList<Producto> lista = inventario.filtrarPorCategoria(CategoriaProducto.ROPA);
        for (Producto i : lista) {
            System.out.println(i.mostrarInfo());
        }
    //Punto 5
        System.out.println("Eliminamos un producto por id y listamos");
        inventario.eliminarProducto("1234");
        inventario.eliminarProducto("0123");
        inventario.listarProductos();
    
    //Punto 6
        System.out.println("Acutalizamos por id la cantidad de un producto:");
        inventario.actualizarStock("2468", 20);
        System.out.println(inventario.buscarProductoPorId("2468").mostrarInfo());
        
    //Punto 7
        System.out.println("Obtenemos al cantidad de stock total");
        System.out.println(inventario.obtenerTotalStock() + " Stock total");
    
    //Punto 8
        System.out.println("Buscamos y mostramos el producto con mayor stock");
        System.out.println(inventario.obtenerProductoConMayorStock().mostrarInfo());
    
    //Punto 9
        System.out.println("Mostramos los productos en el rango de 1000-3000 en precio");
        ArrayList<Producto> prodPorPrecio = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto producto : prodPorPrecio) {
            System.out.println(producto.mostrarInfo());
        }
        
    //Punto 10
        System.out.println("Mostramos las categorias con sus detalles:");
    inventario.mostrarCategoriasDisponibles();
    }
}
