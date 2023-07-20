/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio3;

import Servicio.ClienteServicio;
import Servicio.RutinaServicio;
import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class Desafio3 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ClienteServicio cs = new ClienteServicio();
        RutinaServicio rs = new RutinaServicio();
        int opc;
        do{
            System.out.println("Menu");
            System.out.println("1. Nuevo cliente");
            System.out.println("2. Mostrar lista de clientes");
            System.out.println("3. Actualizar datos de cliente");
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Nueva rutina");
            System.out.println("6. Mostrar rutinas");
            System.out.println("7. Actualizar rutinas");
            System.out.println("8. Eliminar rutina");
            System.out.println("0. Salir");
            opc = read.nextInt();
            read.nextLine();
            switch(opc){
                case 1:
                    cs.registrarCliente();
                    break;
                case 2:
                    cs.obtenerCliente();
                    break;
                case 3:
                    System.out.println("Ingrese el id del cliente que necesita actualizar");
                    cs.actualizarCliente(read.nextInt());
                    read.nextLine();
                    break;
                case 4:
                    System.out.println("Ingrese el id del cliente que necesita actualizar");
                    cs.eliminarCliente(read.nextInt());
                    read.nextLine();
                    break;
                case 5:
                    rs.crearRutina();
                    break;
                case 6:
                    rs.obtenerRutinas();
                    break;
                case 7:
                    System.out.println("Ingrese el id de la rutina que necesita actualizar");
                    rs.actualizarRutina(read.nextInt());
                    read.nextLine();
                    break;
                case 8:
                    System.out.println("Ingrese el id de la rutina que necesita eliminar");
                    rs.eliminarRutina(read.nextInt());
                    read.nextLine();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }
        } while (opc !=0);
        System.out.println("Adios!");
    }
    
    
}
