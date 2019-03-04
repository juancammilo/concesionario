/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.List;

/**
 *
 * @author Jkammilo
 */
public class Cliente extends Usuario{
    
    private String correo;
    
    private int telefono;

    public Cliente(String correo, int telefono, String nombre, String cedula) {
        super(nombre, cedula);
        this.correo = correo;
        this.telefono = telefono;
    }
 
    @Override
    public void mostrarUsuario(){
        System.out.println("Vendedor, nombre: "+ this.getNombre() + ", cedula: "+ this.getCedula() + ", correo: "+correo +", telefono: "+ telefono +".");
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    
    
}
