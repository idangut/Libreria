package com.mycompany.libreria;

/**
 *
 * @author gtior
 * @Description Clase que contiene los datos del vendedor
 */
public class Vendedor {
    
    private String nombre;
    private String apellido;
    private int cedula;
    private float salario;
    private int codigo;

    /**
     * @Description Constructor de la clase Vendedor
     * @param nombre
     * @param apellido
     * @param cedula
     * @param salario
     * @param codigo 
     */
    public Vendedor(String nombre, String apellido, int cedula, float salario, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.salario = salario;
        this.codigo = codigo;
    }
    
    
    /**
     * @Description Getters and Setters
     */
    /**
     * 
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return apellido 
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * 
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * 
     * @return cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * 
     * @param cedula 
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * 
     * @return salario 
     */
    public float getSalario() {
        return salario;
    }

    /**
     * 
     * @param salario 
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * 
     * @return codigo 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * 
     * @param codigo 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   
}
