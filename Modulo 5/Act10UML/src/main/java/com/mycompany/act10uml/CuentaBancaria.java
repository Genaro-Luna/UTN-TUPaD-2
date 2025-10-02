/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act10uml;

/**
 *
 * @author Genaro
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigo, String modificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, modificacion);
    }

    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular){
        this.titular = titular;
        if(titular != null && titular.getCuenta() != this){
            titular.setCuenta(this);
        }
    }

    public String mostrarCuenta() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + "\n" + clave.mostrarClave() + "\n" + titular.mostrarTitular();
    }
    
    
}
