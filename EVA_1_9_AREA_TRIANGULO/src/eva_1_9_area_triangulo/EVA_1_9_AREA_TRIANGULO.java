/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_9_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_1_9_AREA_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Base;
        double Altura;
        double Area;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce la base del triangulo");
        Base = captu.nextDouble();
        System.out.println("Introduce la altura del triangulo");
        Altura = captu.nextDouble();
        
        Area = (Base*Altura)/2;
        System.out.println("El area del triangulo es:");
        System.out.println(Area);
        
        
        
    }
    
}
