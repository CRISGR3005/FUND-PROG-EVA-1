/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_modulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_MODULO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int Valor, Residuo;
      System.out.println("Introduce el valor");
      Scanner input = new Scanner(System.in);
      
      Valor = input.nextInt();
      
      Residuo = Valor % 2; //% modulo --> Residuo
      if (Residuo == 0) // VALOR ES PAR
         System.out.println("El valor es par");
      else
         System.out.println("El valor es impar");
   
}
