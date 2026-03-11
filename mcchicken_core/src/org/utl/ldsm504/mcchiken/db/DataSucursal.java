package org.utl.ldsm504.mcchiken.db;

import java.util.ArrayList;
import java.util.List;
import org.utl.ldsm504.mcchiken.model.Sucursal;

/**
 *
 * @author emont
 */
public class DataSucursal {

    // clase de que genera los objetos
    public List<Sucursal> buildSucursal() {

        List<Sucursal> sucursales = new ArrayList<>();

        Sucursal s1 = new Sucursal("Blv. Mariano Escobedo", "Zona Centro ", 1, 21.1117315, -101.6748961);
        sucursales.add(s1);
        Sucursal s2 = new Sucursal("Blv. Miguel Hidalgo", "Plaza Mayor", 2, 21.1411345, -101.6746078);
        sucursales.add(s2);
        Sucursal s3 = new Sucursal("Blvd Delta, Zona Olimpica", "Centro Max", 3, 21.0882476, -101.6529284);
        sucursales.add(s3);
        Sucursal s4 = new Sucursal("Blvd Delta esq. Blvd Elipson", "Altacia", 4, 21.0876219, -101.6483452);
        sucursales.add(s4);
        
        return sucursales;

    }

}
