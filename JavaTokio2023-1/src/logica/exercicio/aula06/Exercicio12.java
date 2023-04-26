package logica.exercicio.aula06;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		/*Faça um programa que leia 3 valores que representam os lados de um triângulo A, B
			e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior
			dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com
			base nos seguintes casos:
			▪ Se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO;
			▪ Se A2 = B2 + C2 , apresente a mensagem: TRIANGULO RETANGULO;
			▪ Se A2 > B2 + C2 , apresente a mensagem: TRIANGULO OBTUSANGULO;
			▪ Se A2 < B2 + C2 , apresente a mensagem: TRIANGULO ACUTANGULO;
			▪ Se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO;
			▪ Se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES;*/
		
			Scanner sc = new Scanner(System.in);
		
			int x = 0;
		
			System.out.print("Digite o lado A do triângulo: ");
			int a = sc.nextInt();
			System.out.print("Digite o lado B do triângulo: ");
			int b = sc.nextInt();
			System.out.print("Digite o lado C do triângulo: ");
			int c = sc.nextInt();
			
			if(a < b) {
				x = a;
				a = b;
				b = x;
			}
			
			if(b < c) {
				x = c;
				c = b;
				b = x;
			} 
			
			if(a < b) {
				x = a;
				a = b;
				b = x;
			}
		
			System.out.println("A) " + a);
			System.out.println("B) " + b);
			System.out.println("C) " + c);
		
		
			if(a >= b+c) {
				System.out.println("Não forma triângulo.");
			} else if(a*a == b*b + c*c) {
				System.out.println("TRIÂNGULO RETANGULO");
			} else if (a*a > b*b + c*c) {
				System.out.println("TRIÂNGULO OBTUSANGULO");
			} else if (a*a < b*b + c*c) {
				System.out.println("TRIÂNGULO ACUTANGULO");
			} else if (a == b && a == c && c == b) {
				System.out.println("TRIÂNGULO EQUILÁTERO");
			} else if(a == b || b == c || c == a) {
				System.out.println("TRIÂNGULO ISÓCELES");
		}

	}

}

