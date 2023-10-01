/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_5_examen;

import java.util.Scanner;

/**
 *
 * @author Carlos Chacon
 */
public class Problema_5_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double angulo = 45;
        double Velocidad;
        double gravedad = 9.81;
        
        Scanner ingresa = new Scanner (System.in);
        
        System.out.println("Introduce la velocidad inicial en m/s");
        Velocidad = ingresa.nextDouble();
        
        double altura = ((Velocidad * Velocidad) * (angulo * angulo)) / (2 * gravedad);
        System.out.println("La altura máxima que alcanzara el objeto es: ");
        System.out.println(altura + "mts");
        double distancia = ((Velocidad * Velocidad) * (angulo * 2)) / gravedad; 
        System.out.println("La distancia a la que caerá dicho objeto es de:");
        System.out.println(distancia + "mts");
    }
    
}
