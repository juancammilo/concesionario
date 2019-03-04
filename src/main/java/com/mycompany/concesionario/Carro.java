/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanCammilo
 */
public abstract class Carro {
    
    protected String color;
    
    protected String marca;
    
    protected String tipoAlimentacion;
    
    List<Estandar>estandar;
    
    List<Deportivo>deportivo;
    
    List<MaquinariaPesada>maquinaria;
    
    List<Personalizado>personalizado;

    public Carro() {
        estandar = new ArrayList<>();
        deportivo = new ArrayList<>();
        maquinaria = new ArrayList<>();
        personalizado = new ArrayList<>();
        
    }

    public Carro(String color, String marca, String tipoAlimentacion) {
        this.color = color;
        this.marca = marca;
        this.tipoAlimentacion = tipoAlimentacion;
    }
    
    
    public abstract void mostrarCarro();

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public List<Estandar> getEstandar() {
        return estandar;
    }

    public void setEstandar(List<Estandar> estandar) {
        this.estandar = estandar;
    }

    public List<Deportivo> getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(List<Deportivo> deportivo) {
        this.deportivo = deportivo;
    }

    public List<MaquinariaPesada> getMaquinaria() {
        return maquinaria;
    }

    public void setMaquinaria(List<MaquinariaPesada> maquinaria) {
        this.maquinaria = maquinaria;
    }

    public List<Personalizado> getPersonalizado() {
        return personalizado;
    }

    public void setPersonalizado(List<Personalizado> personalizado) {
        this.personalizado = personalizado;
    }
    
    
    
}
