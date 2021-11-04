/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author UEPA-LAB6-PC07
 */
public class TerceiraQuestao {
     public static void main(String [] args){
         
   Scanner pow = new Scanner(System.in);
   
   System.out.println("Quanto você recebeu? R$: ");
    float grana = pow.nextFloat();
    
    double desconto = grana * 0.10;
   System.out.println("Você terá um desconto de R$"+desconto);
   
   double parcela = grana / 3;
   System.out.println("Ao parcelar de 3x, ficará uma parcela mensal de R$"+parcela+" sem juros");
  
    
    
    
     }
    
}
