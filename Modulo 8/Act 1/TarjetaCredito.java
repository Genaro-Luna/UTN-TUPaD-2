/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacesjava;

/**
 *
 * @author Genaro
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numero;
    private String titular;

    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public boolean procesarPago(double monto) throws PagoException{
        if (monto <= 0) throw new PagoException("Monto inválido para pago con tarjeta");
        System.out.printf("Procesando pago con tarjeta ", numero, monto);
        return true;
    }

    @Override
    public double aplicarDescuento(double monto, double porcentaje){
        return monto * (1 - porcentaje / 100.0);
    }
}
