/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.egi.observer;

/**
 Sistema de Notificaciones para Cambios de Precios de Productos
Descripción del Problema:

Una tienda en línea quiere implementar un sistema de notificaciones para
* mantener informados a los clientes cuando se produzcan cambios en los 
* precios de productos específicos que hayan marcado como favoritos. 
* Cada cliente puede elegir seguir uno o varios productos, y recibir una
* notificación cuando el precio de alguno de estos productos cambie.

Requerimientos:

Los clientes deben poder suscribirse y darse de baja de los productos que 
* deseen seguir.Cada vez que el precio de un producto cambia, los clientes 
* que están suscritos a ese producto deben ser notificados automáticamente.
* La implementación debe asegurar que las notificaciones se envíen solo a 
* los clientes interesados y de forma dinámica.
Tarea:

Identifiquen el patrón de diseño que mejor se adapta a este problema y 
* fundamenten su elección.Implementen una solución utilizando el patrón 
* de diseño seleccionado para gestionar las notificaciones de cambios de 
* precio.Expliquen cómo su implementación cumple con los requerimientos 
* planteados y por qué el patrón elegido resulta adecuado.

 **/
public class EGIObserver {

    public static void main(String[] args) {
        System.out.println("SISTEMA DE NOTIFICACIONES DE CAMBIOS DE PRECIOS\n");
        System.out.println("Patron Observer \n");
        System.out.println("Ingresamos un producto y el valor de ese producto \n");
        Product notebookHP = new Product("Notebook HP", 500000.0);
        Product monitorAsus = new Product("Monitor 27 pulgadas Asus", 245000.0);
        System.out.println("ingresa usuario Pepito");
        Observer pepito = new Client("Pepito");
        System.out.println("pepito se suscribe a dos productos");
        notebookHP.addObserver(pepito);
        monitorAsus.addObserver(pepito);
        System.out.println("ingresa usuario Maria");
        Observer maria= new Client("Maria");
        System.out.println("maria se suscribe a dos productos");
        notebookHP.addObserver(maria);
        monitorAsus.addObserver(maria);
        System.out.println("actualizamos precio de notebook y monitor");
        notebookHP.updatePrice(650000.0);
        monitorAsus.updatePrice(270000.0);
        System.out.println("maria se desuscribe de monitorAsus");
        monitorAsus.removeObservador(maria);
        System.out.println("actualizamos precio de notebook y monitor");
        notebookHP.updatePrice(750000.0);
        monitorAsus.updatePrice(370000.0);
    }
}
