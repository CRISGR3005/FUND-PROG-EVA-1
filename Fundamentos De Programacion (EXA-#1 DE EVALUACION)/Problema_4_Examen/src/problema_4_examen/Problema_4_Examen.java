/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_4_examen;

import java.util.Scanner;

/**
 *
 * @author Cristian Gonzalez
 */
public class Problema_4_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double resistencia1,resistencia2,resistencia3,resistencia4,resistencia5;
        double voltaje;
        double resistenciaEquivalente;
        double intensidadCorriente;
        double intensidadR1,intensidadR2,intensidadR3,intensidadR4,intensidadR5;
        
        Scanner captura = new Scanner(System.in);
        
        System.out.println("introduce el valor de la resistencia 1:");
        resistencia1 = captura.nextDouble();
        System.out.println("introduce el valor de la resistencia 2:");
        resistencia2 = captura.nextDouble();
        System.out.println("introduce el valor de la resistencia 3:");
        resistencia3 = captura.nextDouble();
        System.out.println("introduce el valor de la resistencia 4:");
        resistencia4 = captura.nextDouble();
        System.out.println("introduce el valor de la resistencia 5:");
        resistencia5 = captura.nextDouble();
        System.out.println("introduce el voltaje");
        voltaje = captura.nextDouble();
        
        resistenciaEquivalente = 1 / ((1 / resistencia1) + (1 / resistencia2) + (1 / resistencia3) + (1 / resistencia4) + (1 / resistencia5));
        intensidadCorriente = voltaje/resistenciaEquivalente;
        intensidadR1 = voltaje/resistencia1;
        intensidadR2 = voltaje/resistencia2;
        intensidadR3 = voltaje/resistencia3;
        intensidadR4 = voltaje/resistencia4;
        intensidadR5 = voltaje/resistencia5;
        
        System.out.println("La resistencia equivalente del circuito es:");
        System.out.println(resistenciaEquivalente);
        System.out.println("La intenisdad de corriente del cirecuito es:");
        System.out.println(intensidadCorriente);
        System.out.println("la intesidad de la corriente en las resistencias son las siguienets:");
        System.out.println("Intensidad de corriente en la resistencia 1");
        System.out.println(intensidadR1);
        System.out.println("Intensidad de corriente en la resistencia 2");
        System.out.println(intensidadR2);
        System.out.println("Intensidad de corriente en la resistencia 3");
        System.out.println(intensidadR3);
        System.out.println("Intensidad de corriente en la resistencia 4");
        System.out.println(intensidadR4);
        System.out.println("Intensidad de corriente en la resistencia 5");
        System.out.println(intensidadR5);
         
         
        
         
         
         
        
        
        
        
        
        
       
        
        
    }
    
}
