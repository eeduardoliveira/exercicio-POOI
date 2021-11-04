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
public class QuartaQuestao {
     public static void main (String [] args){
    double pao = 0.25;
    double broa = 1.50;   
      
    Scanner pow = new Scanner(System.in);
     System.out.println("Quantidade de Paes vendidos no dia?  ");
    int qtdePao = pow.nextInt();
    
    System.out.println("Quantidade de Broa vendida no dia?  ");
    int qtdeBroa = pow.nextInt();
    
   
   double valorDiario = (qtdePao * pao) + (qtdeBroa * broa );
      System.out.println("Valor arrecadado no dia é de   R$"+valorDiario);
      
    double poupanca = valorDiario * 0.10;
    
    System.out.printf("O dono deverá guardar  R$%.1f", poupanca);
    

    }
}
