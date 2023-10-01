/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_3_examen;

import java.util.Scanner;

/**
 *
 * @author carlos chacon 
 */
public class Problema_3_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio; 
        double velocidad; 
        double area;
        double flujo;
        
        Scanner captura = new Scanner (System.in);
   
        System.out.println("introduce el radio de la tuberia:");
        radio = captura.nextDouble();
        System.out.println("Introduce la velocidad del flujo de agua en m/s:");
        velocidad = captura.nextDouble();
        
        area = 3.1416 * (radio * radio); 
        flujo = area * velocidad;
        
        System.out.println("la cantidad de metros cubicos que fluyen por la tuberia es de:");
        System.out.println(flujo);
    }
    
}
