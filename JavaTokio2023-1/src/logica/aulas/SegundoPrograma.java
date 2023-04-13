package logica.aulas;

import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //O scanner serve pra receber dados do usuário.

		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
			
		System.out.println("Digite sua idade: ");
		System.out.println("Bem-vindo, " + nome + "!");
		System.out.println("Sua idade é: " + sc.nextLine());
		
	}

}
