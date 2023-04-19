package logica.exercicio.aula05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Montar um script onde o usuário entre com o valor em Reais e faça a sua respectiva conversão para:
			//▪ Dólar Americano – Euro - Peso Argentino - Libra Esterlina - Iene
			//▪ Exibir na tela todos os valores obtidos com apenas 02 casas decimais.
			//▪ Valor em real:
			//▪ Valor em dólar:
			//▪ Valor em euro:
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor em real (R$): ");
		double real = sc.nextDouble(); //Entrada do usuário.
		
		double dolar = real * 0.20;
		double euro = real * 0.18;
		double pesoArgentino = real * 42.80;
		double libraEsterlina = real * 0.16;
		double ieneJapones = real * 26.52;
		
		System.out.println("Valor em Dolar: " + dolar);
		System.out.println("Valor em Euro: " + euro);
		System.out.println("Valor em Peso Argentino: " + pesoArgentino);
		System.out.println("Valor em Libra Esterlina: " + libraEsterlina);
		System.out.println("Valor em Iene Japonês: " + ieneJapones);
		
	}

}
