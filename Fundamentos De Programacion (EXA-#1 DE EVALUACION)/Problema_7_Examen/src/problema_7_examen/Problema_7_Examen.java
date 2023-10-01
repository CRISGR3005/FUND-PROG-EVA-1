/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_7_examen;

import java.util.Scanner;

/**
 *
 * @author Cristian Gonzalez
 */
public class Problema_7_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x;
        double x1;
        double x2;
        double pendiente;
        double area;
        double a,b;
        
        Scanner captu = new Scanner(System.in);
       
        System.out.println("introduce el valor de x:");
        x = captu.nextDouble();
                
        pendiente = (2 * x);

        System.out.println("introduce el primer valor de x:");
        x1 = captu.nextDouble();

        System.out.println("introduce el segundo valor de x:");
        x2 = captu.nextDouble();
       
        a = (x1*x1*x1)/3;
        b = (x2*x2*x2)/3;
        
        area = a-b;
        
        System.out.println("El valor de la pendeinte es:");
        System.out.println(pendiente);
        System.out.println("El área es:");
        System.out.println(area);
        
    }
    
}
