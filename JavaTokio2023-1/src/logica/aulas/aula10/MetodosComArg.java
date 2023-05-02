package logica.aulas.aula10;

import java.util.Scanner;

public class MetodosComArg {

	//Metodos sem retorno com argumentos
	
	static void saudacaoComArgs(String nome, int idade) {
		
		//parametros
		System.out.println(nome);
		System.out.println(idade);
		
		if (idade >= 18) {
			System.out.printf("Olá, %s! Você tem %d anos e é maior de idade.", nome, idade);
		} else {
			System.out.printf("Olá, %s! Você tem %d anos e é menor de idade.", nome, idade);

		}
	}
	
	static void somar(int numbA, int numbB) {
		System.out.println("Soma: " + (numbA + numbB));
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//variáveis
		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		saudacaoComArgs(nome, idade);
		
		sc.close();
		
		somar(3, 8);
		
	}

}
