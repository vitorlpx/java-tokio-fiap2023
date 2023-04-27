package logica.exercicio.aula08;

import java.io.ObjectInputStream.GetField;
import java.util.Calendar;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

//		▪ Faça um programa que verifica a hora do dia e exiba a mensagem ao usuário com o
//		nome dele:
//		▪ “Bom dia, FULANO!” se for maior ou igual que 6h da manhã
//		▪ “Boa tarde, FULANO!” se for maior ou igual que 12h
//		▪ “Boa noite, FULANO!” se for maior ou igual que 18h
		
		Scanner sc = new Scanner(System.in);
		
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY); //pega a hora atual.
		
		System.out.println("Olá! Insira seu nome para começarmos: ");
		String nameUser = sc.nextLine();           
          
		System.out.println("Agora são " + hour + "h");
		
		if (hour <= 12) { //hora atual, se ela for menor ou igual a 12 (meio-dia), o programa retorna bom dia.
			System.out.println("Bom dia, " + nameUser);
		} else if (hour > 12 && hour < 18) {
			System.out.println("Boa tarde, " + nameUser);
		} else if(hour > 18) {
			System.out.println("Boa noite, " + nameUser);
		}
		
	}

}
