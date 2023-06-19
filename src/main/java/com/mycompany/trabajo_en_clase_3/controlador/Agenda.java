/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo_en_clase_3.controlador;

import com.mycompany.trabajo_en_clase_3.Modelo.Contacto;
import com.mycompany.trabajo_en_clase_3.Modelo.ListaEnlazadaGenerico;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Agenda<T> {

    Scanner scanner = new Scanner(System.in);
    ListaEnlazadaGenerico<Contacto> lista = new ListaEnlazadaGenerico<>();

    public void AgregarContacto() {
        System.out.println("Ingrese el nombre del contacto: ");
        String nombre = scanner.next();
        System.out.println("Ingrese el numero del Contacto: ");
        String numero = scanner.next();
        Contacto contacto = new Contacto();
        contacto.setNombre(nombre);
        contacto.setTelefono(numero);
        lista.agregar(contacto);
    }
        
    public void BuscarContacto(){ 
        System.out.println("Ingrese el nombre a buscar: ");
        String nombre = scanner.next();
       Contacto elemento = lista.getElementoByNombre(nombre);

    System.out.println (
    "El elemento "+elemento);
    
      
    }
    public void EliminarContacto(){
        System.out.println("Ingrese el nombre a eliminar: ");
        String nombre = scanner.next();
        lista.deleteByNombre(nombre);
  
    }
    public int Menu(){
        System.out.println("Ingrese la opcion que desea: ");
            System.out.println("1.- Crear Contacto");
            System.out.println("2.- Buscar Contacto");
            System.out.println("3.- Eliminar Contacto");
            System.out.println("4.- Salir");

            int op1 = scanner.nextInt();
            scanner.nextLine();
        return op1;
    }
       
    }


