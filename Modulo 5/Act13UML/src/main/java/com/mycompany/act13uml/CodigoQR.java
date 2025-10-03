/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act13uml;

/**
 *
 * @author Genaro
 */
public class CodigoQR {
    private String valor;
    private Usuario user;
    
    
    public CodigoQR(String valor) {
        this.valor = valor;
    }
    
    public void setUsuario(Usuario user){
        this.user = user;
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", user=" + user.toString() + '}';
    }
    
    
}
