/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act12uml;

/**
 *
 * @author Genaro
 */
public class Impuesto {
    private double monto;
    private Contribuyente c;
    public Impuesto(double monto) {
        this.monto = monto;
    }

    public void setC(Contribuyente c) {
        this.c = c;
    }
    
    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", c=" + c.toString() + '}';
    }
    
    
    
    
}
