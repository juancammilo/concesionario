/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 *
 * @author Juancammilo
 */
public class Deportivo extends Carro{
    
    private String velocidadMaxima;
    
    private String convertible;

    public Deportivo(String color, String marca, String tipoAlimentacion, String velocidadMaxima, String convertible) {
        super(color, marca, tipoAlimentacion);
        this.velocidadMaxima = velocidadMaxima;
        this.convertible = convertible;
    }
    
    
    @Override
    public void mostrarCarro(){
        System.out.println("Carro deportivo color: "+this.getColor() +", marca: "+this.getMarca() + ", tipo de alimentacion: "+ this.getTipoAlimentacion() + ", velocidad maxima: "+velocidadMaxima + ", convertible: " + convertible + ".");
    }

    public void setVelocidadMaxima(String velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getConvertible() {
        return convertible;
    }
    
    
}
