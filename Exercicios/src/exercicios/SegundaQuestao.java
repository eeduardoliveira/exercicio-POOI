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
public class SegundaQuestao {
    
    public static void main (String [] args){
    double tulipaChop = 2.80;
    double pizzaMista = 10.00;
    double cobertura = 1.50;        
      
    Scanner pow = new Scanner(System.in);
     System.out.println("Quantas Pessoas Estão na mesa?  ");
    int qtdePessoas = pow.nextInt();
    
    System.out.println("Quantos Chopes a turma vai Pedir?  ");
    int qtdeChops = pow.nextInt();
    

   System.out.println("Quantas Coberturas a turma vai Pedir?  ");
    int qtdeCobertura = pow.nextInt();
 
   double valor = (qtdeChops * tulipaChop) + (qtdeCobertura * cobertura ) + pizzaMista;
      System.out.println("Valor Total Sem gorjeta  R$"+valor);
      
    double gorjeta = valor * 0.10;
    
    System.out.printf("A gorjeta ficará em R$%.1f", gorjeta);
    
    double valorT = valor + gorjeta;
    
    double divisaoPessoas = valorT/qtdePessoas;
    System.out.println("O valor total com 10% será de R$"+valorT+(", Gostaria de Pagar os 10%?"));
    System.out.printf("O valor para cada um ficará R$%.1f %n", divisaoPessoas);

    }
    
}
