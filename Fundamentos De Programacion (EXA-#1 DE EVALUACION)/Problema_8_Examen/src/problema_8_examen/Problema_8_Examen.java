/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_8_examen;

import java.util.Scanner;

/**
 *
 * @author Crsitian Gonzalez
 */
public class Problema_8_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double h,k,a,b,c;
        double verticeY1;
        double verticeY2;
        double focoY1;
        double focoY2;
        
        Scanner captura = new Scanner(System.in);
        
        System.out.println("Ingrese las coordenadas del centro:");
        System.out.println("h:");
        h = captura.nextDouble();
        System.out.println("k:");
        k = captura.nextDouble();
        
        System.out.println("Introduce el valor de a:");
        a = captura.nextDouble();
        System.out.println("Introduce el valor de b:");
        b = captura.nextDouble();
        
        c = (a*a + b*b);
        verticeY1 = k + a;
        verticeY2 = k - a;
        focoY1 = k + c;
        focoY2 = k -c;
        
        System.out.println("La distancia del centro al foco es:");
        System.out.println(c);
        System.out.println("Las coordenadas de los vértices son:");
        System.out.println("h");
        System.out.println (verticeY1);
        System.out.println ("k:");
        System.out.println(verticeY2);
        System.out.println("Las coordenadas de los focos son:");
        System.out.println ("h:");
        System.out.println(focoY1);
        System.out.println ("k:");
        System.out.println(focoY2);
        
        

        
                
        
        
        
        
    }
    
}
