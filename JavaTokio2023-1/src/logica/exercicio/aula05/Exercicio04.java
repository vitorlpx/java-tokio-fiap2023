package logica.exercicio.aula05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//Leia 2 valores A e B, que correspondem a 2 notas de um aluno. A seguir calcule e informe a média do aluno.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o valor de A: ");
		double valorA = sc.nextDouble();
		
		System.out.println("Escreva o valor de B: ");
		double valorB = sc.nextDouble();
		
		double media = (valorA + valorB)/2;
		
		System.out.println("Sua média é: " + media);
	}
}
