
package org.utl.ldsm504.mcchiken.rest;

import com.google.gson.Gson;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import org.utl.ldsm504.mcchicken.controller.ControllerEmpleado;
import org.utl.ldsm504.mcchiken.model.Empleado;

/**
 *
 * @author emont
 */

@Path("Empleado")
public class RESTEmpleado {
    
    @Path("getall")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Response getAll(){
        String out = null;
        
        List<Empleado> empleados = null;
        
        ControllerEmpleado ce = new ControllerEmpleado();
        
        try {
            
            empleados = ce.getAll();
            
            out = new Gson().toJson(empleados);
            
        } catch (Exception e) {
            
            out = """
                  {"error" : "No se puede acceder a la colección"}
                  """;
        }
        
        return Response.status(Response.Status.OK).entity(out).build();
    }
    
}
