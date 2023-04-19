package logica_aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean logicaE = true && false;
		//System.out.println(logicaE);
		
		
		//Atribuindo em variáveis..
		boolean verificarEmail = true;
		boolean verificarSenha = true;
		
		boolean logicaE = verificarEmail && verificarSenha; //Senha e Email verdadeiros = true.
		System.out.println(logicaE);
		
		boolean logicaOU = true || false;
		System.out.println(logicaOU);
		
		boolean negacao = !true;
		System.out.println(negacao);
		
		//Operadores de Strings
		
			String name1 = "camota"; //Apenas a variável. 
	}
	
}