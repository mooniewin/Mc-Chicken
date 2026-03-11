
package org.utl.ldsm504.mcchiken.model;

/**
 *
 * @author emont
 */
public class Empleado {
    
    private int idempleado;
    private Sucursal sucursal;
    private String nombre, apellido, telefono;

    public Empleado() {
    }

    public Empleado(int idempleado, String nombre, String apellido, String telefono, Sucursal sucursal) {
        this.idempleado = idempleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.sucursal = sucursal;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empleado"  
                + "\nID: " + idempleado 
                + "\nNombre: " + nombre
                + "\nApellidos: " + apellido 
                + "\nTelefono: " + telefono 
                + "\nSucursal: " + sucursal
                + "===============";
    }
    
}
