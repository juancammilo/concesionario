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
public class Personalizado extends Carro{
    
    private String rinesLujo;
    
    private String lucesLed;

    public Personalizado(String color, String marca, String tipoAlimentacion, String rinesLujo, String lucesLed) {
        super(color, marca, tipoAlimentacion);
        this.rinesLujo = rinesLujo;
        this.lucesLed = lucesLed;
    }
        
    @Override
    public void mostrarCarro(){
         System.out.println("Carro personalizado color: "+this.getColor() +", marca: "+this.getMarca() + ", tipo de alimentacion: "+ this.getTipoAlimentacion() + ", rines de lujo: "+rinesLujo + ", luces LED: " + lucesLed + ".");
    }

    public String getRinesLujo() {
        return rinesLujo;
    }

    public void setRinesLujo(String rinesLujo) {
        this.rinesLujo = rinesLujo;
    }

    public String getLucesLed() {
        return lucesLed;
    }

    public void setLucesLed(String lucesLed) {
        this.lucesLed = lucesLed;
    }
    
    
}
