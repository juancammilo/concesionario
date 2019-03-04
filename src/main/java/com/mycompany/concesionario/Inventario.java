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
public class Inventario {

    public Inventario() {
        //CARROS
       //ESTANDAR
       Estandar estandar1 = new Estandar("rojo","BMW","gasolina","Si","Cuero");
       Estandar estandar2 = new Estandar("verde","renault","gasolina","no","tela");
       Carro estandares = new Carro() {
           @Override
           public void mostrarCarro() {}
       };
       estandares.getEstandar().add(estandar1);
       estandares.getEstandar().add(estandar2);
       
       //DEPORTIVOS
       Deportivo deportivo1 = new Deportivo("Azul","Audi","Gasolina","220 km","Si");
       Deportivo deportivo2 = new Deportivo("blanco","BMW","Gasolina","290 km","No");
       Carro deportivos = new Carro() {
           @Override
           public void mostrarCarro() {}
       };
       deportivos.getDeportivo().add(deportivo1);
       deportivos.getDeportivo().add(deportivo2);
       
       //MAQUINARIA PESADA
       MaquinariaPesada maquinaria1 = new MaquinariaPesada("Amarillo","Caterpilar","diesel","8 toneladas","retroescabadora");
       MaquinariaPesada maquinaria2 = new MaquinariaPesada("Naranja","Caterpilar","diesel","3 toneladas","aplanadora");
       Carro maquinarias = new Carro() {
           @Override
           public void mostrarCarro() {}
       };
       maquinarias.getMaquinaria().add(maquinaria1);
       maquinarias.getMaquinaria().add(maquinaria2);
       
       //PERSONALIZADOS
       
       Personalizado personalizado1 = new Personalizado("Verde","Mercedes","Gas","Si","Si");
       Personalizado personalizado2 = new Personalizado("negro","ferrari","gasolina","Si","No");
       Carro personalizados = new Carro() {
           @Override
           public void mostrarCarro() {}
       };
       personalizados.getPersonalizado().add(personalizado1);
       personalizados.getPersonalizado().add(personalizado2);
    }
    
}
