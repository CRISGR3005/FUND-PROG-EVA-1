/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_6_entradas_salidas;

import java.util.Scanner;

public class EVA_1_6_ENTRADAS_SALIDAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      String marca;
      String modelo;
      int año;
      //Hay un paquete system, dentro un paquete out, y dentro 
      // de out,la instruccion.
      Scanner Captura = new Scanner(System.in);
              //Hay un paquete system, dentro un paquete out, y dentro
              // de out,la instruccion.
        System.out.println("introduce la marca del auto");
        marca = Captura.nextLine();
        System.out.println("Introduce el modelo del auto");
        modelo = Captura.nextLine();
        System.out.println("Introduce el año del auto:");
        año = Captura.nextInt();
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(año);
        
                
                
        
    }
}
