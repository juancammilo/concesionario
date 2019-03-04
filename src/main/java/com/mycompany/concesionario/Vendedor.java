/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 *
 * @author Jkammilo
 */
public class Vendedor extends Usuario{
    
    private int numeroVentas;

    public Vendedor(int numeroVentas, String nombre, String cedula) {
        super(nombre, cedula);
        this.numeroVentas = numeroVentas;
    }
    
    @Override
    public void mostrarUsuario(){
        System.out.println("Vendedor, nombre: "+ this.getNombre() + ", cedula: "+ this.getCedula() + ", numero de ventas: "+numeroVentas + ".");
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }
    
    
}
