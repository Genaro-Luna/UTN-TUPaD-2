/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act12uml;

/**
 *
 * @author Genaro
 */
public class Act12Uml {

    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Genaro", 204436);
        Impuesto monto = new Impuesto(21.2);
        Calculadora calculadora = new Calculadora();
        
        monto.setC(c);
        
        System.out.println("Datos:");
        System.out.println(monto.toString());
        System.out.println(c.toString());
        
        calculadora.calcular(monto);
    }
}
