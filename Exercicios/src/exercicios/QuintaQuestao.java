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
public class QuintaQuestao {
    public static void main(String [] args){
         double kg = 12.00;
    
   Scanner pow = new Scanner(System.in);
   
   System.out.println("Qual peso da refeição do cliente em Quilos: ");
    float peso = pow.nextFloat();
    System.out.println("Qual peso do prato do cliente em Quilos: ");
    float pesoPrato = pow.nextFloat();
    
    double valorPagar = (peso - pesoPrato) * kg;
    
    System.out.println ("O valor a pagar é de R$"+valorPagar);
    }  
}
