 package logica.exercicio.aula08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
//		▪ Faça um programa que recebe um texto qualquer do usuário.
//		▪ A seguir, exiba:
//			▪ A quantidade de caracteres alfabéticos maiúsculos
//			▪ A quantidade de caracteres alfabéticos minúsculos
//			▪ A quantidade de caracteres numéricos
//			▪ A quantidade de espaço em branco
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qualquer coisa:");
		String text = sc.nextLine();
		
		int upper = 0, lower = 0, number = 0, space = 0, special = 0;
		
		for(int i = 0; i < text.length(); i++) {
			
			char ch = text.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower++;
			} else if (ch >= '0' && ch <= '9') {
				number++;
			} else if (ch >= '!' && ch <= '_') {
				special++;
			} else {
				space++;
			}
		}
		
		System.out.println("A quantidade de letras maiúsculas é: " + upper);
		System.out.println("A quantidade de letras minúsculos é: " + lower);
		System.out.println("A quantidade de caracteres numéricos é: " + number);
		System.out.println("A quantidade de espaços em branco é: " + space);
		System.out.println("A quantidade de caracteres especiais é: " + special);
		
	}
	
}
