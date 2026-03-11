
package org.utl.ldsm504.mcchiken.db;

import java.util.ArrayList;
import java.util.List;
import org.utl.ldsm504.mcchiken.model.Empleado;
import org.utl.ldsm504.mcchiken.model.Sucursal;

/**
 *
 * @author emont
 */
public class DataEmpleado {
    
    public List<Empleado> buildEmpleado(){
        
        List<Empleado> empleados = new ArrayList<>();
        
        // instanciar data sucursal
        DataSucursal ds = new DataSucursal();

        // sacar la la lista de sucursales ya creada
        List<Sucursal> sucursales = ds.buildSucursal();              
        
        Empleado em1 = new Empleado(1,"Yoongi", "Min", "4775963180", sucursales.get(0));
        empleados.add(em1);
        
        Empleado em2 = new Empleado(2,"Namjoon", "Kim", "4795312098", sucursales.get(1));
        empleados.add(em2);
        
        Empleado em3 = new Empleado(3,"Jin", "Kim", "4985631078", sucursales.get(2));
        empleados.add(em3);
        
        Empleado em4 = new Empleado(4,"Hoseok", "Jung", "4795632015", sucursales.get(3));
        empleados.add(em4);
        
        Empleado em5 = new Empleado(5,"Jimin", "Park", "4778921046", sucursales.get(2));
        empleados.add(em5);
        
        Empleado em6 = new Empleado(6,"Taehyung", "Kim", "465916152", sucursales.get(0));
        empleados.add(em6);
        
        return empleados;
    }
    
}
