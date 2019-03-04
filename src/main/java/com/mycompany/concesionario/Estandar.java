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
public class Estandar extends Carro{
    
    private String vidriosElectricos;
    
    private String tipoCojineria;

    public Estandar(String color, String marca, String tipoAlimentacion, String vidriosElectricos, String tipoCojineria) {
        super(color, marca, tipoAlimentacion);
        this.vidriosElectricos = vidriosElectricos;
        this.tipoCojineria = tipoCojineria;
    }
    
    @Override
    public void mostrarCarro(){
         System.out.println("Carro Estandar color: "+this.getColor() +", marca: "+this.getMarca() + ", tipo de alimentacion: "+ this.getTipoAlimentacion() + ", vidrios electricos: "+vidriosElectricos + ", cojineria: " + tipoCojineria + ".");
    }

    public String getVidriosElectricos() {
        return vidriosElectricos;
    }

    public void setVidriosElectricos(String vidriosElectricos) {
        this.vidriosElectricos = vidriosElectricos;
    }

    public String getTipoCojineria() {
        return tipoCojineria;
    }

    public void setTipoCojineria(String tipoCojineria) {
        this.tipoCojineria = tipoCojineria;
    }
    
    
}
