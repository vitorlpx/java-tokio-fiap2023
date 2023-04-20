package logica.exercicio.aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//▪ Faça um programa que peça dois números e imprima o maior deles, e informe caso eles sejam iguais.
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número:");
		int number1 = sc.nextInt();
		
		System.out.println("Insira outro número:");
		int number2 = sc.nextInt();
		
		if (number1 > number2) {
			System.out.println("O " + number1 + " é maior do que o " + number2 + ".");
		} else if (number1 == number2) {
			System.out.println("Os números são iguais.");
		} else {
			System.out.println("O " + number2 + " é maior do que o " + number1 + ".");
		}
		
	}

}
