package logica.exercicio.aula08;

import java.util.Random;
import java.util.Arrays;

public class Exercicio06 {

	public static void main(String[] args) {
		
//		▪ Faça um programa que sorteio 100 números inteiros entre 0 e 100 (incluindo 100).
//		▪ Ao final, exiba as seguintes informações:
	//		▪ Foram sorteados XX números pares.
	//		▪ Foram sorteados XX números ímpares.
	//		▪ Foram sorteados XX números primos.

		Random random = new Random();
		
		int min = 0;
		int max = 100;
		int par = 0;
		int impar = 0;
		int primo = 0;
		
		
		for (int i = 1; i <= 100; i++) {
			int numeroSorteado = random.nextInt((max - min) + 1) + min;            
            System.out.println(numeroSorteado);
  
			if(numeroSorteado % 2 == 0) {
            	par += 1;
            
            } else {
            	impar += 1;
            }   
     
			if ((numeroSorteado%2!=0) && (numeroSorteado%3!=0)) {
				primo +=1;
			}
          
		}		
		System.out.println("O número par foi sorteado " + par + " vezes.");
		System.out.println("O número impar foi sorteado " + impar + " vezes.");
		System.out.println("O número primo foi sorteado " + primo + " vezes.");
	}

}

