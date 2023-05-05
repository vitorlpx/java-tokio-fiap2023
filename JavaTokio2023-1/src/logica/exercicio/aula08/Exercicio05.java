package logica.exercicio.aula08;

import java.util.Scanner;

import java.util.Random;

public class Exercicio05 {

	public static void main(String[] args) {
	
//		▪ Faça um programa que sorteie 10 números aleatórios entre 5 e 50.
//		▪ Some todos esses números e exiba o resultado final.
		
		Random random = new Random();
		
		int min = 5;
		int max = 50;
		int soma = 0;
		
		for (int i = 1; i <= 10; i++) {
            int numeroSorteado = random.nextInt((max - min) + 1) + min;            
            System.out.println("Número " + i + " sorteado: " + numeroSorteado);
            
            soma+= numeroSorteado; 
		}

		System.out.println("A soma de todos os números: " + soma );
		
	}

}
