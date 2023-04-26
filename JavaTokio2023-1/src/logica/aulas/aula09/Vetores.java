package logica.aulas.aula09;

public class Vetores {

	public static void main(String[] args) {
		// Array é a mesma coisa que vetor.

		String[] listaFruta = new String[4];
		
		listaFruta[0] = "Kiwi";
		listaFruta[1] = "Morango";
		listaFruta[2] = "Maracuja Doce";
		listaFruta[3] = "Pitaia";
		
		System.out.println("Frutas pos 1: " + listaFruta[1]);
		
		String[] listaFrutas2 = {"Manga", "Jaca", "Morango", "Laranja"};
		
		int qtdFrutas = listaFrutas2.length;
		System.out.println(qtdFrutas);
		
		for(int i = 0; i < qtdFrutas; i++) {
			System.out.println(listaFrutas2[i]);
		}
		
		// --------------------------------------
		
		int[] numeros = {0, 5, 20, 30};
		
		//For indexado:
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("Pos: %d -- Valor: %d \n", i, numeros[1]);
		}
	}

}
