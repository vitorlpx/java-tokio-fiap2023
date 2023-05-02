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

		if (dayOfWeek == 3) {
			System.out.println("Dia de feira.");
		} else {
			System.out.println("Não é dia de feira.");
		}
		
	}

}
