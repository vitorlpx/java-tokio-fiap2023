package logica.exercicio.aula05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//Leia 2 valores A e B, que correspondem a 2 notas de um aluno. A seguir calcule e informe a média ponderada do aluno, sabendo que a nota A tem peso 4 e a nota B
		//tem peso 6.
		
		//Exemplo: nota a * 4 e nota b * 6.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o sua nota 1: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Escreva o sua nota 2: ");
		double n2 = sc.nextDouble();
		
		double mediaPonderada = (n1 * 4 + n2 * 6) / (4 + 6);
		
		System.out.println("Sua média ponderada é: " + mediaPonderada);
		
	}
	
}
