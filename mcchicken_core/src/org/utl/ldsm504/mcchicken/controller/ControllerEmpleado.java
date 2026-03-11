package org.utl.ldsm504.mcchicken.controller;

import java.util.ArrayList;
import java.util.List;
import org.utl.ldsm504.mcchiken.db.DataEmpleado;
import org.utl.ldsm504.mcchiken.model.Empleado;

/**
 *
 * @author emont
 */
public class ControllerEmpleado {

    public List<Empleado> getAll() {
        
        List<Empleado> empleados = new ArrayList<>();

        DataEmpleado de = new DataEmpleado();

        empleados = de.buildEmpleado();

        return empleados;
    }
}
