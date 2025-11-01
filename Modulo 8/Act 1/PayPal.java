/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacesjava;

/**
 *
 * @author Genaro
 */
public class PayPal implements Pago {
    private String cuenta;

    public PayPal(String cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public boolean procesarPago(double monto) throws PagoException{
        if (monto <= 0) throw new PagoException("Monto inválido para PayPal");
        System.out.printf("Procesando pago por PayPal %s de $%.2f%n", cuenta, monto);
        return true;
    }
}
