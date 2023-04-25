package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2;
		
		do {
			System.out.println("Digite a nota 1:");
			nota1 = sc.nextDouble();
			
			if(nota1 < 0 || nota1 > 10) {
				System.out.println("Valor inválido.");
			}
		} while (nota1 < 0 || nota1 > 10);
		
		do {
			System.out.println("Digite a nota 2:");
			nota2 = sc.nextDouble();
			
			if(nota2 < 0 || nota2 > 10) {
				System.out.println("Valor inválido.");
			}
		} while (nota2 < 0 || nota2 > 10);
		
		double media = (nota1 + nota2) / 2;

		System.out.println("Média: " + media);
		System.out.printf("Média: %.2f ", media); //No printf usamos "," ao invés de "+".
	
	}

}
