/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.Scanner;

/**
 *
 * @author Jkammilo
 */
public class Logica {

    public Logica() {
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
       
       int opcion=0;
       do{
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("    El menu ");
       System.out.println("1. Ver los clientes");
       System.out.println("2. Ver los vendedores");
       System.out.println("3. Ver los carros");
       System.out.println("4. Agregar cliente");
       System.out.println("5. Agregar vendedor");
       System.out.println("6. Agregar carro");
       //System.out.println("7. Vender carro");
       System.out.println("8. Salir");
       System.out.print("Digite una opcion: ");
       opcion = entrada.nextInt();
        
       switch(opcion){
           
            case 1: int i=1;
                    for (Cliente clientes1 : clientes.getClientes()) {
                        System.out.println("El cliente numero: "+i+"\nnombre: "+ clientes1.getNombre() + "\ncedula: "+clientes1.getCedula()+"\ncorreo: "+ clientes1.getCorreo() +"\ntelefono: "+ clientes1.getTelefono());
                        i++;
                    }
                    break;
            case 2:
                    i=1;
                    for (Vendedor vendedor : vendedores1.getVendedores()) {
                        System.out.println("El vendedor numero: "+i+"\nnombre: "+ vendedor.getNombre() + "\ncedula: "+ vendedor.getCedula() +"\nnumero de ventas: "+vendedor.getNumeroVentas());
                        i++;
                    }
                    break;
            case 3: i=1;
                    System.out.println("\nCarros estandar:");
                    for (Estandar estandar : estandares.getEstandar()) {
                        System.out.println(i+" carro estandar\ncolor: "+estandar.getColor()+"\nmarca: "+estandar.getMarca()+"\ntipo de alimentacion: "+estandar.getTipoAlimentacion()+"\nvidrios electricos: "+estandar.getVidriosElectricos()+"\ntipo de cojineria: "+estandar.getTipoCojineria()+".");                    
                        i++;
                    }
                    i=1;
                    System.out.println("\nCarros deportivos: ");
                    for (Deportivo deportivo : deportivos.getDeportivo()){
                        System.out.println(i+" carro estandar\ncolor: "+deportivo.getColor()+"\nmarca: "+deportivo.getMarca()+"\ntipo de alimentacion: "+deportivo.getTipoAlimentacion()+"\nvelocidad maximo: "+deportivo.getVelocidadMaxima()+"\nconvertible: "+deportivo.getConvertible()+".");                    
                        i++;
                    }
                    i=1;
                    System.out.println("\nCarros maquinaria pesada: ");
                    for (MaquinariaPesada maquinaria : maquinarias.getMaquinaria()){
                        System.out.println(i+" carro estandar\ncolor: "+maquinaria.getColor()+"\nmarca: "+maquinaria.getMarca()+"\ntipo de alimentacion: "+maquinaria.getTipoAlimentacion()+"\npeso del carro: "+maquinaria.getPesoCarro()+"\ntipo de funcion: "+maquinaria.getTipoFuncion()+".");                    
                        i++;
                    }
                    i=1;
                    System.out.println("\nCarros personalizados: ");
                    for (Personalizado personalizado : personalizados.getPersonalizado()){
                        System.out.println(i+" carro personalizado\ncolor: "+personalizado.getColor()+"\nmarca: "+personalizado.getMarca()+"\ntipo de alimentacion: "+personalizado.getTipoAlimentacion()+"\nrines de lujo: "+personalizado.getRinesLujo()+"\nluces led: "+personalizado.getLucesLed()+".");                    
                        i++;
                    }
                    break;
            case 4: 
                Scanner cliente = new Scanner(System.in);
                System.out.println("Digite el nombre: ");
                String nombreCliente = cliente.nextLine();
                System.out.println("Digite la cedula: ");
                String cedulaCliente = cliente.nextLine();
                System.out.println("Digite el correo: ");
                String correoCliente = cliente.nextLine();
                System.out.println("Digite el telefono");
                int telefonoCliente = cliente.nextInt();
                
                Cliente cliente3 = new Cliente(correoCliente, telefonoCliente, nombreCliente, cedulaCliente);
                clientes.getClientes().add(cliente3);
                
                break;
            case 5:
                Scanner vendedor = new Scanner(System.in);
                System.out.println("Digite el nombre: ");
                String nombreVendedor = vendedor.nextLine();
                System.out.println("Digite la cedula: ");
                String cedulaVendedor = vendedor.nextLine();
                System.out.println("Digite el numero de ventas: ");
                int numVentasVendedor = vendedor.nextInt();
                                
                Vendedor vendedor3 = new Vendedor(numVentasVendedor, nombreVendedor, cedulaVendedor);
                vendedores1.getVendedores().add(vendedor3);
                break;
            
            case 6:
                Scanner entrada2 = new Scanner(System.in);
       
                System.out.println("    Menu de agregar carros ");
                System.out.println("1. Agregar estandar");
                System.out.println("2. Agregar deportivo");
                System.out.println("3. Agregar maquinaria pesada");
                System.out.println("4. Agregar personalizado ");
                System.out.print("Digite una opcion: ");
                int opcion2 = entrada.nextInt();
                switch(opcion2){
                    case 1:
                        Scanner estandar = new Scanner(System.in);
                        System.out.println("Digite el color: ");
                        String colorEstandar = estandar.nextLine();
                        System.out.println("Digite la marca: ");
                        String marcaEstandar = estandar.nextLine();
                        System.out.println("Digite el tipo de alimentacion: ");
                        String alimentacionEstandar = estandar.nextLine();
                        System.out.println("Digite si tiene vidrios electricos (Si/No): ");
                        String vidriosEstandar = estandar.nextLine();
                        System.out.println("Digite el tipo de cojineria: ");
                        String tipoCojineriaEstandar = estandar.nextLine();
                        
                        Estandar estandar3 = new Estandar(colorEstandar,marcaEstandar,alimentacionEstandar,vidriosEstandar,tipoCojineriaEstandar);
                        estandares.getEstandar().add(estandar3);
                        break;
                    case 2:
                        Scanner deportivo = new Scanner(System.in);
                        System.out.println("Digite el color: ");
                        String colorDeportivo = deportivo.nextLine();
                        System.out.println("Digite la marca: ");
                        String marcaDeportivo = deportivo.nextLine();
                        System.out.println("Digite el tipo de alimentacion: ");
                        String alimentacionDeportivo = deportivo.nextLine();
                        System.out.println("Digite la velocidad maxima: ");
                        String velocidadMaximaDeportivo = deportivo.nextLine();
                        System.out.println("Digite si es convertible (si/no): ");
                        String convertibleDeportivo = deportivo.nextLine();
                        
                        Deportivo deportivo3 = new Deportivo(colorDeportivo,marcaDeportivo,alimentacionDeportivo,velocidadMaximaDeportivo,convertibleDeportivo);
                        deportivos.getDeportivo().add(deportivo3);
                        break;
                    case 3:
                        Scanner maquinaria = new Scanner(System.in);
                        System.out.println("Digite el color: ");
                        String colorMaquinaria = maquinaria.nextLine();
                        System.out.println("Digite la marca: ");
                        String marcaMaquinaria = maquinaria.nextLine();
                        System.out.println("Digite el tipo de alimentacion: ");
                        String alimentacionMaquinaria = maquinaria.nextLine();
                        System.out.println("Digite el peso: ");
                        String pesoMaquinaria = maquinaria.nextLine();
                        System.out.println("Digite el tipo de funcion principal: ");
                        String tipoMaquinaria = maquinaria.nextLine();
                        
                        MaquinariaPesada maquinaria3 = new MaquinariaPesada(colorMaquinaria,marcaMaquinaria,alimentacionMaquinaria,pesoMaquinaria,tipoMaquinaria);
                        maquinarias.getMaquinaria().add(maquinaria3);
                        break;
                    case 4:
                        Scanner personalizado = new Scanner(System.in);
                        System.out.println("Digite el color: ");
                        String colorPersonalizado = personalizado.nextLine();
                        System.out.println("Digite la marca: ");
                        String marcaPersonalizado = personalizado.nextLine();
                        System.out.println("Digite el tipo de alimentacion: ");
                        String alimentacionPersonalizado = personalizado.nextLine();
                        System.out.println("Digite si tiene rines de lujo (si/no): ");
                        String rinesPersonalizado = personalizado.nextLine();
                        System.out.println("Digite si tiene luces LED(si/no): ");
                        String lucesPersonalizado = personalizado.nextLine();
                        
                        Personalizado personalizado3 = new Personalizado(colorPersonalizado,marcaPersonalizado,alimentacionPersonalizado,rinesPersonalizado,lucesPersonalizado);
                        personalizados.getPersonalizado().add(personalizado3);
                        break;
                    default:System.out.println("opcion no valida");
                        break;
                }
                break;
            case 8:
                break;
            default: System.out.println("Opcion no valida");
                break;
        }
       }while(opcion!=8);
           
        //System.out.println("la cantidad de vendedores es: "+vendedores1.getVendedores().size());
       
        
    }
    
}
