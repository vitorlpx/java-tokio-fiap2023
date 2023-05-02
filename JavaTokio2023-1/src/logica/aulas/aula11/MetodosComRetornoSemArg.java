package logica.aulas.aula11;

public class MetodosComRetornoSemArg {

	static String saudacao() { //dentro dos parenteses seria os argumentos 
		return "Olá!";
	}
	
	public static void main(String[] args) {

		String retorno = saudacao();
		System.out.println(retorno);
		
	}

}
