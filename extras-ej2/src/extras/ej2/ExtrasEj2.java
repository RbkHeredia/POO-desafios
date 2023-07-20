/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.ej2;

import Entidades.FiguraGeometrica;
import Servicios.FiguraServicios;

/**
 *
 * @author rebek
 */
public class ExtrasEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiguraServicios fs= new FiguraServicios();
        
        FiguraGeometrica f1=fs.crearFigura();
//        FiguraGeometrica f2=fs.crearFigura();
//        FiguraGeometrica f3=fs.crearFigura();
//        
        System.out.println("Figura 1:");
        fs.imprimirFigura(f1);
//        System.out.println("Figura 2:");
//        fs.imprimirFigura(f2);
//        System.out.println("Figura 3:");
//        fs.imprimirFigura(f3);
    }
    
}
