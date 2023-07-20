/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.FiguraGeometrica;
import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class FiguraServicios {
    public FiguraGeometrica crearFigura(){
        Scanner read = new Scanner(System.in);
        FiguraGeometrica fig = new FiguraGeometrica();
        int option;
        do{
             System.out.println("Elije el tipo de figura: \n 1. Cuadrado \n 2. Triangulo \n 3. Circulo");
             option = read.nextInt();
        } while(option < 1 || option > 3);
        
        switch(option){
            case 1:
                System.out.println("Ingrese el lado del cuadrado");
                int lado = read.nextInt();
                fig.setPerimetro(lado *4);
                fig.setArea(lado*lado);
                break;
            case 2:
                System.out.println("Ingrese la base del triangulo");
                int base = read.nextInt();
                System.out.println("Ingrese el lado del triangulo");
                int lado1 = read.nextInt();
                System.out.println("Ingrese el otro lado");
                int lado2 = read.nextInt();
                System.out.println("Ingrese la altura del triangulo");
                int altura = read.nextInt();
                fig.setPerimetro(base +lado1+lado2);
                fig.setArea((base*altura)/2);
            case 3:
                System.out.println("Ingrese el radio del circulo");
                int radio = read.nextInt();
                fig.setArea(Math.PI*radio*radio);
                fig.setPerimetro(Math.PI*radio*2);
                
        }
        
        return fig;
    }
    
    public void imprimirFigura(FiguraGeometrica fig){
        System.out.println("El perímetro de la figura es:" + fig.getPerimetro());
        System.out.println("El área de la figura es:" + fig.getArea());
    }
}
