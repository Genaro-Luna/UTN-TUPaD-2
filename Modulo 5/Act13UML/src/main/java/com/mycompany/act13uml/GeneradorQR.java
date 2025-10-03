/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act13uml;

/**
 *
 * @author Genaro
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario){
        CodigoQR codigo = new CodigoQR(valor);
        codigo.setUsuario(usuario);
        
        System.out.println("QR generado, detalles:\n" + codigo.toString());
    }
}
