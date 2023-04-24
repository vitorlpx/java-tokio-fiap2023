package logica.exercicio.aula06;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		//▪ Faça um programa que receba o ano de nascimento da pessoa e retorne:
        	//▪ Se o voto é obrigatório este ano;
			//▪ Se o voto é opcional este ano;
			//▪ Se o voto é proibido este ano.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque seu ano de nascimento: ");
		
		int anoNascimento = sc.nextInt();
		Calendar calendario = GregorianCalendar.getInstance();
		int conta = calendario.get(Calendar.YEAR) - anoNascimento;
		
		if (conta < 16) {
			System.out.println("Sua idade é " + conta + ". Seu voto é proibido!");
		} else if ((conta >= 16 && conta < 18) || conta > 70) {
			System.out.println("Sua idade é " + conta + ". Seu voto é opcional.");
		} else {
			System.out.println("Sua idade é " + conta + ". Seu voto é obrigatório!");
		}
		
	}
	
}
