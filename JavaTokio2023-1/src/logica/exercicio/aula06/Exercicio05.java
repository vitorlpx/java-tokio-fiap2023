package logica.exercicio.aula06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//▪ Escreva um algoritmo que recebe dois números e um caractere (representando uma das operações matemáticas (+, -, *, /)
		//▪ O programa deve calcular o valor final de acordo com a operação selecionada.
		//▪ Ou seja, se a entrada for 5, 6 e *, então seu programa dever mostrar 30.

		//▪ Dica: switch/case facilita as coisas.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque uma operação: (+, -, *, /)");
		String operacoes = sc.nextLine();

		System.out.println("Escreva dois números: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
	
		
		int soma = numero1 + numero2;
		int sub = numero1 - numero2;
		int mult = numero1 * numero2;
		int div = numero1 / numero2;
		
		switch (operacoes) {
			case "+":
				System.out.println("Soma:" + soma);
				break;
			case "-":
				System.out.println("Subtração:" + sub);
				break;
			case "*":
				System.out.println("Multiplicação:" + mult);
				break;
			case "/":
				System.out.println("Divisão:" + div);
				break;
		}
	}

}
