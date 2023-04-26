package logica.exercicio.aula07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		//▪ Faça um programa que exiba a mensagem “Olá, Mundo”.
		//▪ Essa mensagem deverá ser exibida repetidamente.
		//▪ Ao final de toda iteração da repetição, você deve perguntar ao usuário se ele deseja exibir a mensagem novamente.
		//▪ Se sim, exiba novamente. Senão, saia do loop e exiba a mensagem “Fim”.
		
		int i = 0;
		String msg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, Mundo!");
		
		do {
			System.out.println("Deseja repetir a mensagem acima? (y/n)");
			msg = sc.nextLine();
			i++;
		}
		while (msg.equals("y"));
		
		System.out.println("Você repetiu " + i + " vezes. \nFim.");

	}

}
