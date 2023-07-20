/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.ej1;

import Entidades.Vehiculo;
import Servicios.VehiculoServicios;

/**
 *
 * @author rebek
 */
public class ExtrasEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VehiculoServicios vs = new VehiculoServicios();
        Vehiculo v1 = vs.crearVehiculo();
        Vehiculo v2 = vs.crearVehiculo();
        Vehiculo v3 = vs.crearVehiculo();
        
        System.out.println("El vehiculo 1 avanzó "+vs.moverse(5, v1.getTipo())+ " en los primeros 5 segundos");
        System.out.println("El vehiculo 2 avanzó "+vs.moverse(5, v2.getTipo())+ " en los primeros 5 segundos");
        System.out.println("El vehiculo 3 avanzó "+vs.moverse(5, v2.getTipo())+ " en los primeros 5 segundos");
        System.out.println("-------------------------------------");
        
        System.out.println("El vehiculo 1 avanzó "+vs.moverse(10, v1.getTipo())+ " en los primeros 10 segundos");
        System.out.println("El vehiculo 2 avanzó "+vs.moverse(10, v2.getTipo())+ " en los primeros 10 segundos");
        System.out.println("El vehiculo 3 avanzó "+vs.moverse(10, v3.getTipo())+ " en los primeros 10 segundos");
          
        System.out.println("-------------------------------------");
        System.out.println("El vehiculo 1 avanzó "+vs.moverse(60, v1.getTipo())+ " en los primeros 1 minuto");
        System.out.println("El vehiculo 2 avanzó "+vs.moverse(60, v2.getTipo())+ " en los primeros 1 minuto");
        System.out.println("El vehiculo 3 avanzó "+vs.moverse(60, v3.getTipo())+ " en los primeros 1 minuto");
        System.out.println("==========================");
        //falta 2da parte
        
    }
    
}
