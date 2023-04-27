package logica.aulas.aula09;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] tabuleiro = new char [3][3];
		
		tabuleiro[0][0] = 'X'; //uso de somente uma aspas por causa que é um char (somente uma string).
		tabuleiro[1][1] = 'O';
		tabuleiro[2][2] = 'X';
		
		System.out.println(tabuleiro);
		
		//Se a linha for igual à coluna, é a diagonal principal.
		
	}

}
