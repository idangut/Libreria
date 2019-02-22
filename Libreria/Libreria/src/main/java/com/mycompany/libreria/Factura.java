package com.mycompany.libreria;

/**
 *
 * @author gtior
 * @Description Clase que genera la factura al cliente
 */
public class Factura {
    
    private int idFactura;
    private int inVenta;
    private int idCliente;

    public Factura(int idFactura, int inVenta, int idCliente) {
        this.idFactura = idFactura;
        this.inVenta = inVenta;
        this.idCliente = idCliente;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getInVenta() {
        return inVenta;
    }

    public void setInVenta(int inVenta) {
        this.inVenta = inVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
}
