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
public class PrimeiraQuestao {
       public static void main(String [] args){
   Scanner pow = new Scanner(System.in);
   
   System.out.println("Insira a distância em Km: ");
    float km = pow.nextFloat();
    
      
    System.out.println("Insira o tempo em Horas: ");
    float time = pow.nextFloat();
      
    float velocidadeMedia = km / time;
    String Piloto = "Jonas";
       
   /* System.out.printf("a velocidae Média do "+Piloto);;
    System.out.printf (" foi de %.2f", velocidadeMedia);
    System.out.printf(" km/h ");*/
    
    System.out.println("a velocidade media do "+Piloto+" foi de "+velocidadeMedia+" km/h");
    
   }
}

