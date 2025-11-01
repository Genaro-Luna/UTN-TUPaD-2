/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacesjava;

/**
 *
 * @author Genaro
 */
public class InterfacesJava {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Genaro", "genaro@ejemplo.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 25.50));
        pedido.agregarProducto(new Producto("Teclado", 45.00));
        System.out.printf("Total pedido: $%.2f%n", pedido.calcularTotal());

        //Cambiar estado y notificar
        pedido.cambiarEstado(Estado.PAGADO);

        //Pagar con TarjetaCredito y descuento
        TarjetaCredito tc = new TarjetaCredito("9999-xxxx-xxxx-1111", "Genaro");
        double totalConDescuento = tc.aplicarDescuento(pedido.calcularTotal(), 10);
        try {
            if (tc.procesarPago(totalConDescuento)) {
                System.out.println("Pago con tarjeta exitoso.");
                pedido.cambiarEstado(Estado.ENVIADO);
            }
        } catch (PagoException e) {
            System.err.println("Error de pago: " + e.getMessage());
        }
    }
}
