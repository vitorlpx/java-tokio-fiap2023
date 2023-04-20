package logica.exercicio.aula06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//▪ Faça um programa para a leitura de quatro notas parciais de um aluno. O programa deve calcular a média alcançada pelo aluno e apresentar:
			//▪ A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
			//▪ A mensagem "Em recuperação", se a média for entre cinco, incluindo o cinco, e sete;
			//▪ A mensagem "Reprovado", se a média for menor que cinco.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Coloque a primeira nota: ");
		double n1 = sc.nextInt();

		System.out.println("Coloque a segunda nota: ");
		double n2 = sc.nextInt();
		
		System.out.println("Coloque a terceira nota: ");
		double n3 = sc.nextInt();
		
		System.out.println("Coloque a quarta nota: ");
		double n4 = sc.nextInt();
		
		double nFinal = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("A sua nota final é: " + nFinal);
		
		if (nFinal >= 7) {
			System.out.println("Aprovado.");
		} else if (nFinal >= 5) {
			System.out.println("Em recuperação.");
		} else {
			System.out.println("Reprovado.");
		}
		
	}

}
