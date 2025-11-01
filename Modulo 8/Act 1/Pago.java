/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfacesjava;

/**
 *
 * @author Genaro
 */
public interface Pago {
    boolean procesarPago(double monto) throws PagoException;
}
