/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo_en_clase_3.Modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class ListaEnlazadaGenerico<T> {

    private NodoGenerico<T> cabeza;
    private int tamaño;
    private int tamaño2;

    //agregar
    public void agregar(T elemento) {
        NodoGenerico<T> nuevo = new NodoGenerico(elemento);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoGenerico<T> ultimoNodo = obtenerUltimo();
            ultimoNodo.setSiguiente(nuevo);
        }
        tamaño++;
    }

    public NodoGenerico<T> obtenerUltimo() {
        NodoGenerico<T> actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();

        }
        return actual;
    }

    public T getElementoByNombre(String nombre) {
        NodoGenerico<T> actual = cabeza;
        for (int i = 0; i < tamaño; i++) {
            actual = actual.getSiguiente();
            if (actual.getElemento() == nombre) {
                System.out.println(actual.getElemento());
            }

        }
        return actual.getElemento();
    }

    public void instanciar(String indice) {
        NodoGenerico<T> actual = cabeza;
        for (int i = 0; i < tamaño; i++) {
            if (actual.getElemento() == indice) {
                NodoGenerico<T> anterior = obtenerNodoByIndice(i - 1);
                NodoGenerico<T> nodoActual = anterior.getSiguiente();
                anterior.setSiguiente(nodoActual.getSiguiente());

            }
            actual = actual.getSiguiente();

        }

        tamaño--;
    }

    public void deleteByNombre(String indice) {
        NodoGenerico<T> actual = cabeza;
        for (int i = 0; i < tamaño; i++) {
            actual = actual.getSiguiente();
            if (actual.getElemento() == indice) {

                NodoGenerico<T> anterior = obtenerNodoByIndice(i-1);
                NodoGenerico<T> nodoActual = anterior.getSiguiente();
                anterior.setSiguiente(nodoActual.getSiguiente());
            }
            tamaño--;

        }
    }

    public NodoGenerico<T> obtenerNodoByIndice(int indice) {
        NodoGenerico<T> actual = cabeza;
        for (int i = 0; i < indice; i++) {

            actual = actual.getSiguiente();
        }
        return actual;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

}
