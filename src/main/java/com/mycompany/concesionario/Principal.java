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
public class Principal {

    public Principal() {
        
       //VENDEDORES
       Vendedor vendedor1 = new Vendedor(0, "andres", "1234");
       Vendedor vendedor2 = new Vendedor(0, "Carlos", "5678");
       
       Usuario vendedores1;
       vendedores1 = new Usuario() {
           @Override
           public void mostrarUsuario() {}
       };
       vendedores1.getVendedores().add(vendedor1);
       vendedores1.getVendedores().add(vendedor2);
       
       //CLIENTES
       Cliente cliente1 = new Cliente("antonio@mail.com", 3123245, "antonio", "1357");
       Cliente cliente2 = new Cliente("juliana@mail.com", 4189034, "juliana", "2468");
       
       Usuario clientes = new Usuario() {
           @Override
           public void mostrarUsuario() {}
       };
       
       clientes.getClientes().add(cliente1);
       clientes.getClientes().add(cliente2);
       
              
        for (Cliente clientes1 : clientes.getClientes()) {
            System.out.println("El cliente, con nombre "+ clientes1.getNombre() + " y cedula "+clientes1.getCedula()+" "+ clientes1.getCorreo() +" "+ clientes1.getTelefono());
        }
        
        for (Vendedor vendedor : vendedores1.getVendedores()) {
            System.out.println("El vendedor, con nombre "+ vendedor.getNombre() + " y cedula "+ vendedor.getCedula() +" numero de ventas "+vendedor.getNumeroVentas());
        }
       
        //System.out.println("la cantidad de vendedores es: "+vendedores1.getVendedores().size());
       
    }
        
    public static void main (String[] args){
        Principal inicio = new Principal();
        /**

        
       
        */
        
    }
}
