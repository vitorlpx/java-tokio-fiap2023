package logica.aulas.aula11;

public class MetodoComRetorno {

	static int funcaoSomar(int a, int b) {
//		int soma = a + b;
		return a + b;
	}
	
	public static void main(String[] args) {
		
		int retornarSoma = funcaoSomar(3, 8);
		
		System.out.println(retornarSoma);
	}

}
