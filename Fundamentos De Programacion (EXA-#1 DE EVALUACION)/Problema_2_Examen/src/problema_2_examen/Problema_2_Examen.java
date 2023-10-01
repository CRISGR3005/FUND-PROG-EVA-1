/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_2_examen;

import java.util.Scanner;

/**
 *
 * @author Cristian Gonzalez
 */
public class Problema_2_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Fahrenheint;
        double celsius;
        double kelvin;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("ingresa la temperatura en grados Fahrenheint");
        Fahrenheint = captu.nextDouble();
        
        celsius = (Fahrenheint -32)*5/9;
        kelvin = celsius + 273.15;
       
        System.out.println("La temperatura en grados Celsius es:");
        System.out.println(celsius);
        System.out.println("La temperatura en grados Kelvin es:");
        System.out.println(kelvin);
        
    }
    
}
