package logica.exercicio.aula07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		//▪ Faça um programa que receba 12 valores digitados pelo usuário e, ao final, informe qual é o maior deles.

			Scanner sc = new Scanner(System.in);
			
			int valor = 0;
			
			for(int i = 0; i <= 12; i++) {				
				System.out.println("Digite qualquer valor: ");
				int comparacao = sc.nextInt();
				
				if(comparacao > valor) {
					valor = comparacao;					
				}
			}
			
			System.out.println("O maior número é: " + valor);
	}

}
