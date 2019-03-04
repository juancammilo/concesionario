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
public class MaquinariaPesada extends Carro{
    
    private String pesoCarro;
    
    private String tipoFuncion;

    public MaquinariaPesada(String color, String marca, String tipoAlimentacion, String pesoCarro, String tipoFuncion) {
        super(color, marca, tipoAlimentacion);
        this.pesoCarro = pesoCarro;
        this.tipoFuncion = tipoFuncion;
    }
          
    @Override
    public void mostrarCarro(){
         System.out.println("Carro Maquinaria Pesada color: "+this.getColor() +", marca: "+this.getMarca() + ", tipo de alimentacion: "+ this.getTipoAlimentacion() + ", peso del carro: "+pesoCarro + ", tipo de maquinaria: " + tipoFuncion + ".");
    }

    public String getPesoCarro() {
        return pesoCarro;
    }

    public void setPesoCarro(String pesoCarro) {
        this.pesoCarro = pesoCarro;
    }

    public String getTipoFuncion() {
        return tipoFuncion;
    }

    public void setTipoFuncion(String tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }
    
    
}
