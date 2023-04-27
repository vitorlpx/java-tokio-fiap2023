package logica.exercicio.aula08;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

//		▪ Faça um programa que verifica o dia da semana.
//		▪ Se for terça-feira, exiba ao usuário que terá feira de rua.

		Scanner sc = new Scanner(System.in);
		
		Calendar c = Calendar.getInstance();
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("QUE DIA É HOJE EM?"
				+ "1. SEGUNDA"
				+ "2. TERÇA"
				+ "3. QUARTA"
				+ "4. QUINTA"
				+ "5. SEXTA"
				+ "6. SABÁDO"
				+ "7. DOMINGO");
		String day = sc.nextLine();
		

		switch(day) {
		case "1":
			System.out.println("HO");
		}
		
		
		
	}

}
