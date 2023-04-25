package logica.aulas.aula07;

import java.util.Scanner;

public class WhileLaco {

	public static void main(String[] args) {
		
		//A estrutura de repetição só para quando uma condição for verdadeira.

		Scanner sc = new Scanner(System.in);
		
//		int i = 0;
//		
//		System.out.println("Informe um number: ");
//		int number = sc.nextInt();
//		
//		while (i <= 10) {
//			System.out.println(number + " x " + i + " = " +(number * i));
//			i++;
//		}
		
//		Modificadores de Laço
		
		int i = 0;
		
		while (i <10) {
			i++;
			
			if (i == 3) {
				continue;
			}
			
			if (i == 7) {
				break;
			}
			
			System.out.println("Cambalhota " + i);
		}
		
		System.out.println("Fim do programa.");
		
	}

}
