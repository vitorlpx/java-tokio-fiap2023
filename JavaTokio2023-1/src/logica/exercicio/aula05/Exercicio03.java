package logica.exercicio.aula05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Elabore um programa que receba o nome do usuário e o seu gênero da seguinte forma:
		//▪ [ M ] para masculino
		//▪ [ F ] para feminino
		//▪ [ O ] outro
		//▪ [ N ] não responder

		//▪ Exiba uma mensagem final da seguinte forma:
		//▪ “Olá, Alexandre! Você escolheu a seguinte opção de gênero: M”
		//▪ Dica: utilize o tipo char para o gênero.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Coloque o seu gênero: "
		+ "\n" + "[ M ] para masculino;"
		+ "\n" + "[ F ] para feminino;"
		+ "\n" + "[ O ] outro;"
		+ "\n" + "[ N ] não responder.");
		
		char genero = sc.nextLine().charAt(0);  //Pegando somente a primeira letra do que o usuário digitou.
		
		System.out.println("Olá, " + nome + "." + " Você escolheu a seguinta opção de gênero: " + genero);
	}

}
