/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_1_examen;

import java.util.Scanner;

/**
 *
 * @author IRIS_MARIANA_MUNOZ_BENCOMO
 */
public class Problema_1_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String equipo;
        String proyecto;
        String integ1;
        String integ2;
        String integ3;
        String integ4;
        String integ5;
        String integ6;
        
        Scanner captura = new Scanner(System.in);
        
        System.out.println("ingresa el nombre de tu equipo:");
        equipo = captura.nextLine();
        System.out.println("Ingresa el nombre de tu proyecto:");
        proyecto = captura .nextLine();
        System.out.println("ingresa el nombre y numero de control del primer integrante del equipo:");
        integ1 = captura.nextLine();
        System.out.println("ingresa el nombre y numero de control del segundo integrante del equipo:");
        integ2 = captura.nextLine();
        System.out.println("ingresa el nombre y numero de control del tercer integrante del equipo:");
        integ3 = captura.nextLine();
        System.out.println("ingresa el nombre y numero de control del cuarto integrante del equipo:");
        integ4 = captura.nextLine();
        System.out.println("ingresa el nombre y numero de control del quinto integrante del equipo:");
        integ5 = captura.nextLine();
        System.out.println("ingresa el nombre y numero de control del sexto integrante del equipo:");
        integ6 = captura.nextLine();
        System.out.println("Los datos que ingresaste son los siguientes:");
        
        System.out.println("Nombre del equipo:" );
        System.out.println(equipo);
        System.out.println("Nombre del proyecto:" );
        System.out.println(proyecto);
        System.out.println("Integrantes:");
        System.out.println(integ1);
        System.out.println(integ2);
        System.out.println(integ3);
        System.out.println(integ4);
        System.out.println(integ5);
        System.out.println(integ6);
     
        
        
        
        
        
        
    }
    
}
