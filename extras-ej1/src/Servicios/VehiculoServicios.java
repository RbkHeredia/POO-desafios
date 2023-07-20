/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidades.Vehiculo;
/**
 *
 * @author rebek
 */
public class VehiculoServicios {
    public Vehiculo crearVehiculo(){
        Scanner read = new Scanner(System.in);
        Vehiculo v1 = new Vehiculo();
        int opcion;
        do{
            System.out.println("¿Cual es el tipo de vehiculo? \n 1. Automovil \n 2. Motocicleta \n 3. Bicicleta");
            opcion = read.nextInt();
        } while (opcion <1 || opcion > 3);
        read.nextLine();
        switch (opcion){
            case 1:
                v1.setTipo("Automovil");
                break;
            case 2:
                v1.setTipo("Motocicleta");
                break;
            case 3:
                v1.setTipo("Bicicleta");
                break;
        }
        System.out.println("¿Cual es la marca?");
        v1.setMarca(read.nextLine());
        System.out.println("¿Cual es el modelo?");
        v1.setModelo(read.nextLine());
        System.out.println("¿De que año es?");
        v1.setAnio(read.nextInt());
        return v1;
    }
    
    public int moverse(int tiempo, String tipo){
        int distancia = 0;
        switch (tipo){
            case "Automovil":
                distancia= 3*tiempo;
                break;
            case "Motocicleta":
                distancia = 2*tiempo;
                break;
            case "Bicicleta":
                distancia = tiempo;
                break;
        }
        return distancia;
    }
    
    public int frenar(String tipo, int distancia){
        switch (tipo){
            case "Automovil":
                distancia+=2;
                break;
            case "Motocicleta":
                distancia+=2;
                break;
            case "Bicicleta":
                break;
        }
        return distancia;
    }
}
