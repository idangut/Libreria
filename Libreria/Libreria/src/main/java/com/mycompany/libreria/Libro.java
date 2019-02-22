package com.mycompany.libreria;
/**
 *
 * @author gtior
 * @Description Clase que contiene los datos de los libros
 */
public class Libro {
    
    private String autor;
    private byte version;
    private String editorial;
    private int precio;
    private byte cantidad;
    
    /**
     * @description: Constructor de la clase Libro
     * @param autor
     * @param version
     * @param editorial
     * @param precio 
     * @param cantidad
     */

    public Libro(String autor, byte version, String editorial, int precio, byte cantidad) {
        this.autor = autor;
        this.version = version;
        this.editorial = editorial;
        this.precio = precio;
        this.cantidad = cantidad;
    } 

    
    /**
 * 
 * @Description: Getters and Setters 
 */
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public byte getVersion() {
        return version;
    }

    public void setVersion(byte version) {
        this.version = version;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    
    
}
