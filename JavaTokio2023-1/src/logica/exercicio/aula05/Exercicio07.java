package logica.exercicio.aula05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crie um programa que receba o valor do produto e valor pago.
		//Calcule o troco a ser pago.
		//O valor do troco deve ser exibido no terminal.
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque o valor do produto: ");
		double valorProduto = sc.nextDouble();
		
		System.out.println("Coloque o valor pago: ");
		double valorPago = sc.nextDouble();
		
		double troco = valorProduto - valorPago;
		
		System.out.println("O valor do troco: R$" + troco);
		
	}

}
