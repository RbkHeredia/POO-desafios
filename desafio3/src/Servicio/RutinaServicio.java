/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rebek
 * crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion): 
* recibe el identificador
de una rutina existente y los nuevos datos de la rutina, y actualiza la información 
* correspondiente en el sistema.
eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema.
 */
public class RutinaServicio {
    Scanner read = new Scanner(System.in);
    ArrayList<Rutina> rutinas = new ArrayList<>();
    
    public Rutina crearRutina(){
        Rutina r = new Rutina();
        r.setId(rutinas.size()+1);
        System.out.println("Ingresa el nombre de la rutina");
        r.setNombre(read.nextLine());
        System.out.println("Ingresa la duracion");
        r.setDuracion(read.nextDouble());
        read.nextLine();
        System.out.println("Ingresa el nivel de dificultad");
        r.setNivelDificultad(read.nextLine());
        System.out.println("Ingresa la descripcion");
        r.setDescripcion(read.nextLine());
        rutinas.add(r);
        return r;
    }
    
    public void obtenerRutinas(){
        if(rutinas.isEmpty()){
            System.out.println("No hay rutinas para mostrar");
        } else {
            for (int i = 0; i < rutinas.size(); i++) {
            System.out.println(rutinas.get(i).getId() +" "+rutinas.get(i).getNombre());
            }
        }
    }
    
    public void actualizarRutina(int id){
        if(rutinas.isEmpty()){
            System.out.println("No hay rutinas para actualizar");
        } else {
            for (int i = 0; i < rutinas.size(); i++) {
            if(rutinas.get(i).getId()== id){
                Rutina r = rutinas.get(i);
                r.setId(rutinas.size()+1);
                System.out.println("Ingresa el nombre de la rutina");
                r.setNombre(read.nextLine());
                System.out.println("Ingresa la duracion");
                r.setDuracion(read.nextDouble());
                read.nextLine();
                System.out.println("Ingresa el nivel de dificultad");
                r.setNivelDificultad(read.nextLine());
                System.out.println("Ingresa la descripcion");
                r.setDescripcion(read.nextLine());
                rutinas.add(r);
                }
            }
        }
    }
    public void eliminarRutina(int id){
        boolean rutine = false;
        if(rutinas.isEmpty()){
            System.out.println("No hay rutinas para eliminar");
        } else {
            for (int i = 0; i < rutinas.size(); i++) {
                if(rutinas.get(i).getId() == id){
                    rutinas.remove(i);
                    System.out.println("La rutina se eliminó correctamente");
                    rutine = true;
                    break;
                }
            }
        }
        if(rutine == false){
            System.out.println("No existe el cliente");
        }
        
    }
}
