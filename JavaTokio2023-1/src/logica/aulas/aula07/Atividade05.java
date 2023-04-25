package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a qtd de produtos.");
		int qtdProdutos = sc.nextInt();
		
		for (int i = 0; i <= qtdProdutos; i++) { 
			System.out.println("Produto " + i + 0);
		}
		
	}

}
