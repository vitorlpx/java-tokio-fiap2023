package logica.exercicio.aula08;

import java.util.Random;

public class Exercicio05 {

	public static void main(String[] args) {
	
//		▪ Faça um programa que sorteie 10 números aleatórios entre 5 e 50.
//		▪ Some todos esses números e exiba o resultado final.
	
		Random rand = new Random(); 
		
		for (int i = 0; i == 10; i++) {
			System.out.println(rand.nextInt(5, 50));
			
		}
		
		System.out.println("teste");
	}

}
