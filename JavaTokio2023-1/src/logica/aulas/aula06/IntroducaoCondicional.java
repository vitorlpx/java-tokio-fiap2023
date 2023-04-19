package logica.aulas.aula06;

public class IntroducaoCondicional {

	public static void main(String[] args) {
		// ------------------------- //
		//Estrutura Condicional Simples
		// ------------------------- //
		
		/*float nota = 5;
		
		if (nota < 6) {
			System.out.println("Sua nota é: " + nota);
		}
		*/
		
		// ------------------------- //
		//Estrutura Condicional Composta
		// ------------------------- //
		
		float notaFinal = 5.9f;
		
		if (notaFinal < 6) {
			System.out.println("Reprovado.");
		} else {
			System.out.println("Aprovado.");
		}
		
		// ------------------------- //
		//Estrutura Condicional Encadeada
		// ------------------------- //
		
		if (notaFinal < 4) {
			System.out.println("Reprovado.");
		} else {
			if (notaFinal < 6) {
				System.out.println("Recuperação.");
			} else {
				System.out.println("Aprovado.");
			}
		}
		
		// ------------------------- //
		//Estrutura Condicional Composta - else if
		// ------------------------- //
		
		if (notaFinal < 4) {
			System.out.println("Reprovado.");
		} else if (notaFinal < 6) {
			System.out.println("Recuperação.");
		} else {
			System.out.println("Aprovado.");
		}
			
	}

}
