
package org.utl.ldsm504.mcchiken.rest;

import com.google.gson.Gson;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import org.utl.ldsm504.mcchicken.controller.ControllerSucursal;
import org.utl.ldsm504.mcchiken.model.Sucursal;

/**
 *
 * @author emont
 */
@Path("Sucursal")
public class RESTSucursal {
    
    @Path("getall")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Response getAll(){
        String out = null;
        
        // generar la lista de objetos
        List<Sucursal> sucursales = null;
        
        // intanciar al controlador
        ControllerSucursal cs = new ControllerSucursal();
        
        try {
            
            sucursales = cs.getAll();
            
            // solo aguanta arraylist y list
            out = new Gson().toJson(sucursales);
            
        } catch (Exception e) {
            
            out = """
                  {"error" : "No se puede acceder a la colección"}
                  """;
            
        }
        
        return Response.status(Response.Status.OK).entity(out).build();
    }
    
}
