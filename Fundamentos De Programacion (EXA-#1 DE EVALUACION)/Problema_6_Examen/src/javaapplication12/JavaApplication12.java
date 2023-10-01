/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author Ceistian Gonzalez
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double velocidadIA;
        double velocidadAF;
        double tiempoRot;
        double distanaciaMR;
        double radioRueda;
        double distanciaAR;
        double velocidadAP;
        double velocidadProm;
        double aceleracionA;
        double aceleracion;
        double frecGiro;
       
        Scanner captura = new Scanner(System.in);
        
        System.out.print("Ingresa la velocidad inicial angular en radianes/s:");
        velocidadIA = captura.nextDouble();
        System.out.print("Ingresa la velocidad angular final en radianes/s:");
        velocidadAF = captura.nextDouble();
        System.out.print("Ingresa el tiempo de rotación en segundos:");
        tiempoRot = captura.nextDouble();
        System.out.print("Ingresa el radio de la rueda en metros:");
        radioRueda = captura.nextDouble();
        
        distanciaAR = (velocidadIA + velocidadAF)* tiempoRot/2;
        distanaciaMR = distanciaAR * radioRueda;
        velocidadAP = (velocidadIA + velocidadAF)/2;
        velocidadProm = velocidadAP * radioRueda;
        aceleracionA = (velocidadAF - velocidadIA)/ tiempoRot;
        aceleracion = aceleracionA * radioRueda;
        frecGiro = velocidadAP / (2*3.1416);
        
        System.out.println("Estos son los datos obtenidos:");
        System.out.println("Distancia angular recorrida:");
        System.out.println(distanciaAR);
        System.out.println("Distancia en metros recorrida:");
        System.out.println(distanaciaMR);
        System.out.println("Velocidad angular promedio:");
        System.out.println(velocidadAP);
        System.out.println("Velocidad en m/s promedio:");
        System.out.println(velocidadProm);
        System.out.println("Aceleración angular:");
        System.out.println(aceleracionA);
        System.out.println("Aceleración en m/s^2:");
        System.out.println(aceleracion);
        System.out.println("Frecuencia de giro:");
        System.out.println(frecGiro);        
    }
    
}
