/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rebek
 * 
 * registrarCliente: lo registra en el sistema.
obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
actualizarCliente(int id, String nombre, int edad, double altura, double peso, 
* String objetivo): recibe el identificador
de un cliente existente y los nuevos datos del cliente, y actualiza la información 
* correspondiente en el sistema.
eliminarCliente(int id): recibe el identificador de un cliente existente 
* y lo elimina del sistema.

 */
public class ClienteServicio {
    Scanner read = new Scanner(System.in);
    ArrayList<Cliente> clientes = new ArrayList<>();
    public Cliente registrarCliente(){
        Cliente c1 = new Cliente();
        c1.setId(clientes.size()+1);
        System.out.println("Ingresa tu nombre");
        c1.setNombre(read.nextLine());
        System.out.println("Ingresa tu edad");
        c1.setEdad(read.nextInt());
        read.nextLine();
        System.out.println("Ingresa tu altura");
        c1.setAltura(read.nextDouble());
        System.out.println("Ingresa tu peso");
        c1.setPeso(read.nextDouble());
        read.nextLine();
        System.out.println("Ingresa tu objetivo");
        c1.setObjetivo(read.nextLine());
        clientes.add(c1);
        return c1;
    }
    
    public void obtenerCliente(){
        if(clientes.isEmpty()){
            System.out.println("No hay clientes para mostrar");
        } else {
            for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).getId() +" "+clientes.get(i).getNombre());
            }
        }
    }
    
    public void actualizarCliente(int id){
        if(clientes.isEmpty()){
            System.out.println("No hay clientes para actualizar");
        } else {
            for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getId()== id){
                Cliente c = clientes.get(i);
                System.out.println("Ingresa tu nombre");
                c.setNombre(read.nextLine());
                System.out.println("Ingresa tu edad");
                c.setEdad(read.nextInt());
                read.nextLine();
                System.out.println("Ingresa tu altura");
                c.setAltura(read.nextDouble());
                System.out.println("Ingresa tu peso");
                c.setPeso(read.nextDouble());
                read.nextLine();
                System.out.println("Ingresa tu objetivo");
                c.setObjetivo(read.nextLine());
            }
        }
        }
        
        
    }
    
    public void eliminarCliente(int id){
        boolean client = false;
        if(clientes.isEmpty()){
            System.out.println("No hay clientes para eliminar");
        } else {
            for (int i = 0; i < clientes.size(); i++) {
                if(clientes.get(i).getId() == id){
                    clientes.remove(i);
                    System.out.println("El cliente se eliminó correctamente");
                    client = true;
                    break;
                }
            }
        }
        if(client == false){
             System.out.println("No existe el cliente");
        }
        
    }
    
}
