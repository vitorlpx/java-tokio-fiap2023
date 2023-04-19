package exercicios.extras;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//Pedir ao usuário a digitação de um número inteiro qualquer, exibir o que se pede:
		//a) O número digitado pelo usuário;
		//b) O seu sucessor;
		//c) O seu antecessor;
		//d) O dobro do número digitado
		//e) A metade do número digitado.

				
		Scanner sc = new Scanner(System.in);
				
		int number;
		int sucessor;
		int antecessor;
		int dobro;
		double metade;
				
		System.out.println("Digite um número: ");
		number = sc.nextInt();
				
		//Número digitado pelo usuário.
		System.out.println("O número digitado foi: " + number);
				
		//Número sucessor.
		sucessor = number + 1;
		System.out.println("Sucessor do número digitado: " + sucessor);
				
		//Número antecessor.
		antecessor = number - 1;
		System.out.println("Antecessor do número digitado: " + antecessor);
				
		//Dobro do número digitado.
		dobro = number * 2;
		System.out.println("Dobro do número digitado: " + dobro);
				
		//Metade do número digitado.
		metade = number / 2;
		System.out.println("Metade do número digitado: " + metade);
				

	}

}
