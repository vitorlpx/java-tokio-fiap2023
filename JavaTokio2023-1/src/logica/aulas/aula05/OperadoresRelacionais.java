package logica.aulas.aula05;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(6 < 14);
		
		int num1 = 40;
		int num2 = 34;
		
		System.out.println(num1 != 13); //40 != (diferente) de 13? 
		System.out.println(num1 = 14); //Aqui está acontecendo uma atribuição.
		System.out.println(num1 == 13); //40 é == (igual) a 13? 
		
		boolean ligado = true;
		
		System.out.println(num1 < num2);
		
		boolean comparacao = num1 < num2; //Colocando a operação dentro de uma variável.	
		System.out.println(comparacao);
	}

}
