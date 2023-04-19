package logica.aulas.aula05;

import java.util.Scanner;

public class Tipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//f serve para conversão para o float.
		float preco = 10.99f;
		float preco2 = (float) 12.90;
		
		System.out.println("Float 1: " + preco);
		System.out.println("Float 2: " + preco2);
		
		int precoInteiro = (int) 2.50;
		System.out.println("Valor inteiro: " + precoInteiro);
		
		//Aqui em cima só vai converter o número e mostrar ele inteiro.
		
		int numeroX = 6;
		double numeroXDouble = numeroX;
		System.out.println(" ");
		System.out.println(numeroX);
		System.out.println(numeroXDouble);
		
		//Conversão de um dado inserido pelo usuário.
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("Digite um número: ");
		int numeroIn = (int) sc.nextInt();
		
		System.out.println(numeroIn);
		
	}

}
