package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		//A estrutura de repetição só para quando uma condição for verdadeira.
		
		//O usuário digita um número, e conta até o número que ele digitou.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número n: ");
		
		int n = sc.nextInt();
		int i = 1;
		
		while(i <= n) {
			System.out.println(i);
			i++;
		}
		
		
		
	}

}
