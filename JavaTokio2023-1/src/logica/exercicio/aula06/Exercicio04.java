package logica.exercicio.aula06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//▪ Faça um programa que leia 2 valores inteiros (A e B).
		//▪ A seguir, o programa deve mostrar uma mensagem "São Múltiplos" ou "Não são Múltiplos", indicando se os valores lidos são múltiplos entre si.
		
		//Dica:
			//▪ Como que eu sei que 2 números são ou não são múltiplos um do outro?
			//▪ Conjunto dos Múltiplos de 2 = {2, 4, 6, 8, 10, ...}
			//▪ Então se observa que os múltiplos de um número são divisíveis por esse número, então o resto dessa divisão será 0.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro valor inteiro: ");
		int valorMultiplo1 = sc.nextInt();
		
		System.out.println("Escreva o segundo valor inteiro: ");
		int valorMultiplo2 = sc.nextInt();
		
		int calc = valorMultiplo1%valorMultiplo2;
		
		if (calc == 0) {
			System.out.println("São múltiplo.");
		} else {
			System.out.println("Não são múltiplos.");
		}
		
	}

}
