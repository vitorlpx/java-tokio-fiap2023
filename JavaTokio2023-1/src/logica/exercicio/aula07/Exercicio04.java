package logica.exercicio.aula07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//▪ Faça um programa que receba 10 valores digitados pelo usuário e, ao final, informe qual é a soma deles.

		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int soma = 0;
		
		do {
			System.out.println("Digite qualquer valor inteiro: ");
			int numberUser = sc.nextInt();	
			
			soma += numberUser;
			i++;
			
		} while (i < 10);
		
			System.out.println("A soma é: " + soma);
	}

}
