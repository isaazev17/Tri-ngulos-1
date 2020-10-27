/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triângulo1_isabelaazevedo;

import java.util.Scanner;
/**
 *
 * @author Isabela
 */
public class Triângulo1_IsabelaAzevedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
      
      
      Scanner entrada;  
      int  A,B,C;
      
      entrada = new Scanner (System.in);
      
      System.out.print ("Digite o valor do A:");
      A =entrada.nextInt();
      
      System.out.print ("Digite o valor de B:");
      B = entrada.nextInt();
      
      System.out.print ("Digite o valor de C:");
      C = entrada.nextInt();
      
              
      
     if (A+B>C && A+C>B && B+C>A){
        
    System.out.println("Forma um triângulo");
        
     }
     else if (A==B && A==C && B==C){
        
     System.out.println("Forma um equilátero");
     
     }
     
     else if (A!=B && A!=C && B!=C){
     
     System.out.println ("Forma um escaleno");
     
  
    }
     else if (A==B && A!=C || A==C && A!=B||B==C && B!=A){
      
     System.out.println ("Forma um isósceles");
    
     }

    }
    
}
   