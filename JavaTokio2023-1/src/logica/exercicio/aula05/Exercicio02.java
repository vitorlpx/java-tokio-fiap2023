package logica.exercicio.aula05;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//▪ Elabore um programa que declare um número inteiro, float e double.
		//▪ Atribua valores à essas 3 variáveis.
		//▪ Exiba no terminal os 3 valores como números.
		//▪ Agora, converta esses 3 números para String e exiba novamente.
		
		int numeroInteiro = 9;
		float numeroFloat = 11f;
		double numeroDouble = 1.5;
		
		System.out.println(numeroInteiro);
		System.out.println(numeroFloat);
		System.out.println(numeroDouble);
		
		String numeroIntString = Integer.toString(numeroInteiro);
		String numeroFloatString = Float.toString(numeroFloat);
		String numeroDoubleString = Double.toString(numeroDouble);
		
		System.out.println(numeroInteiro);
		System.out.println(numeroFloat);
		System.out.println(numeroDouble);
	}

}
