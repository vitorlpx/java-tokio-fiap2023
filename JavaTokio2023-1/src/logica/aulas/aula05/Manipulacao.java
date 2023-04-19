package logica.aulas.aula05;

import java.util.Scanner;

public class Manipulacao {

	public static void main(String[] args) {

		//Valor double para string.
		double salario = 1300.50;
		String salarioStr = Double.toString(salario);		
		
		
		//Verificação do tipo de string.
		System.out.println(salarioStr.getClass().getSimpleName());
		System.out.println(" ");
		
		
		//Converter String para variável.
		String idade = "26";
		
		int idadeInt = Integer.parseInt(idade);
		System.out.println(idadeInt);
		
		
		//String para o float.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Preço do produto: ");
		String preco = sc.nextLine();
		
		float precoFloat = Float.parseFloat(preco);
		System.out.println(precoFloat);
	}

}
