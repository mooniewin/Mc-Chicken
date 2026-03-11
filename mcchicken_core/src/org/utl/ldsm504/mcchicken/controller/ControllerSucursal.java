
package org.utl.ldsm504.mcchicken.controller;

import java.util.ArrayList;
import java.util.List;
import org.utl.ldsm504.mcchiken.db.DataSucursal;
import org.utl.ldsm504.mcchiken.model.Sucursal;

/**
 *
 * @author emont
 */
public class ControllerSucursal {
    
    // seleccionar
    public List<Sucursal> getAll(){
        
        List<Sucursal> sucursales = new ArrayList<>();
        
        // instancia a data sucursal, para ver las sucursales
        DataSucursal ds = new DataSucursal();
        
        sucursales = ds.buildSucursal();
        
        return sucursales;
    }
    
    // insertar
    public void insert(Sucursal s){}
    
    // actualizar
    public void update(Sucursal s){}
    
    // eliminar
    public void delete(int id){}
    
}
