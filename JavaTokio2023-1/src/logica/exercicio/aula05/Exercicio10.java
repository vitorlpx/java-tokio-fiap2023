package logica.exercicio.aula05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leia 3 valores de entrada, referentes à idade de uma pessoa em: anos, meses e dias.
		//Exemplo: eu tenho 30 anos, 2 meses 3 7 dias. Calcule e exiba o total de dias que essa
		//pessoa já viveu. Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias
		//e todo mês com 30 dias.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos: ");
		int ano = sc.nextInt();
		
		System.out.println("Digite quantos meses de vida que você tem: ");
		int mes = sc.nextInt();
		
		System.out.println("Digite quantos dias de vida que vocÊ tem: ");
		int dias = sc.nextInt();
		
		int conta1 = ano * 365 + mes * 30 + dias;
		
		System.out.println("Total de dias vividos: " + conta1);
		
	}

}
