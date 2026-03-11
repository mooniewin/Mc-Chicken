// empezar con las entidades fuertes 
package org.utl.ldsm504.mcchiken.model;

/**
 *
 * @author emont
 */
public class Sucursal {
    
    private String domicilio, plaza;
    private int idsucursal;
    private double latitud,longitud;
    
    public Sucursal(String domicilio, String plaza, int idsucursal, double latitud, double longitud) {
        this.domicilio = domicilio;
        this.plaza = plaza;
        this.idsucursal = idsucursal;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Sucursal() {
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    public int getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(int idsucursal) {
        this.idsucursal = idsucursal;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "==============="
                + "\nPlaza: " + plaza 
                + "\nID: " + idsucursal 
                + "\nDomicilio: " + domicilio 
                + "\nLatitud: "+ latitud 
                + "\nLongitud: " + longitud;
    }
    
}
