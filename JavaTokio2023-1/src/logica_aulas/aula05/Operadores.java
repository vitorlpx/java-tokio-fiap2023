package logica_aulas.aula05;

public class Operadores {

	public static void main(String[] args) {
		
		float n1 = 5f;
		float n2 = 2f;
		
		float soma = n1 + n2;
		System.out.println(soma);
		
		float sub = n1 - n2;
		System.out.println(sub);
		
		float mult = n1 * n2;
		System.out.println(mult);
		
		float div = n1 / n2;
		System.out.println(div);
		
		float resto = n1 % n2;
		System.out.println(resto);
	
		
		//Operadores unários
		
		int numero = 15;
		System.out.println(--numero);

		System.out.println(++numero); //O número irá armazenar.
		System.out.println(numero+1); //O número não irá armazenar.
		
		
		//Operadores de atribuição
		
		int number = 5;
		
		number += 5; //Isso é a mesma coisa de -> number = 5 + 5.
		System.out.println(number);
	}
}
