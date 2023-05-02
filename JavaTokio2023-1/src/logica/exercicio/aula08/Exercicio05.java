package logica.exercicio.aula08;

public class Exercicio05 {

	public static void main(String[] args) {
	
//		▪ Faça um programa que sorteie 10 números aleatórios entre 5 e 50.
//		▪ Some todos esses números e exiba o resultado final.
	
		int min = 5;
		int max = 50;
		
		for (int i = 0; i == 10; i++) {
			double numSorteado = min + Math.random() * (max - min);		
			System.out.println(i++);
		}
		
		
	}

}
