
import java.util.List;
import org.utl.ldsm504.mcchicken.controller.ControllerSucursal;
import org.utl.ldsm504.mcchiken.model.Sucursal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author emont
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // probar que la estructura funciona
        ControllerSucursal cs = new ControllerSucursal();
        
        List<Sucursal> sucursales = cs.getAll();
        
        for(Sucursal s : sucursales){
            System.out.println(s);
        }
        
    }
    
}
