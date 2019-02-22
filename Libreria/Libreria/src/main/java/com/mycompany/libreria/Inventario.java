package com.mycompany.libreria;

import java.lang.reflect.Array;

/**
 *
 * @author gtior
 * @Description: Clase que controla el inventario de los libros hereda de la clase Libro para poder
 * utilizar variables como cantidad y precio
 */
public class Inventario {
   
    
     public Array libros[];//Arreglo para recorrer los libros
    /**
     * @Description: Metodo que sirve para calcular el libro mas vendido 
     * @param cantidad
     * @return 
     */
 public int masVendido(int cantidad){
     
     return cantidad;
 }
 
    /**
     * @Description: Metodo que sirve para calcular el libro menos vendido
     * @param cantidad
     * @return 
     */
 public int menosVendido(int cantidad){
     
     return cantidad;
 }
    
    /**
     * @Description: Metodo para calcular el libro mas caro
     * @param precio
     * @return 
     */
 public int masCaro(int precio){
     
     return precio;
 }
 
    /**
     * @Description: Metodo para calcular el libro mas barato
     * @param precio
     * @return 
     */
 public int masBarato(int precio){
     
     return precio;
 }
 
    /**
     * @Description: Metodo para generar una alarma cuando el inventario sea menor a 10
     * @param cantidad
     * @return 
     */
 public int alarma(int cantidad){
     
     return cantidad;
 }
    
}
