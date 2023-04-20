package logica.exercicio.aula06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//▪ Faça um programa que leia um número, e informe se ele é par ou impar.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número:");
		int number = sc.nextInt();
		
		int calc = number%2;
		
		if (calc == 1 ) {
			System.out.println("O número é impar.");
		} else {
			System.out.println("O número é par.");
		}
	}

}
