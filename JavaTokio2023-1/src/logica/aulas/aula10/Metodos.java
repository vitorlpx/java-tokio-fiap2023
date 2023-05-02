package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {

	//Metodos sem retorno e sem parametros.
	
	static void saudacao() { // isso é a função, mesma coisa que def ou let.
		System.out.println("Chamando a função!");

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		
		if (idade >= 18) {
			System.out.printf("Olá, %s! Você tem %d anos.", nome, idade);
			System.out.println("\n" + " E você é maior de idade!");
		} else {
			System.out.printf("Olá, %s! Você tem %d anos.", nome, idade);
			System.out.println("\n" +" Menor de idade.");
		}
	}
	
	public static void main(String[] args) {

		saudacao();
		
	}

}
