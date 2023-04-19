package logica.exercicio.aula05;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Neste problema, deve-se ler o nome de uma peça que chamaremos de peça1, o	número de peças1 que o usuário quer, o valor unitário de cada peça1, o nome de uma
		//peça2, o número de peças2 e o valor unitário de cada peça2. Após, calcule e mostre o
		//valor a ser pago.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o nome da primeira peça?");
		String primeiraPeca1 = sc.nextLine();

		System.out.println("Quantas peças que você deseja? ");
		double numeroPeca1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Qual o valor dessa peça?");
		double valor1 = Double.parseDouble(sc.nextLine());
		
		double soma1 = numeroPeca1 * valor1;
		
		System.out.println("Qual é o nome da segunda peça?");
		String primeiraPeca2 = sc.nextLine();

		System.out.println("Quantas peças que você deseja? ");
		double numeroPeca2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Quantas peças que você deseja? ");
		double valor2 = Double.parseDouble(sc.nextLine());
		
		double soma2 = numeroPeca1 * valor1;
		
		double total = soma1 + soma2;
		
		System.out.println("O valor total dos dois produtos é de R$:" + total);
		
	}
}
