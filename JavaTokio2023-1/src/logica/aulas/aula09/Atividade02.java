package logica.aulas.aula09;

public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[4][5];
		System.out.println(matriz[0].length); //matriz.length = pega as LINHAS. e matriz.length[0] = pega as colunas tem linha 0.
				
		int qtdLinhas = matriz.length;
		int qtdColunas = matriz[3].length;
		
		System.out.println("Linhas: " + qtdLinhas);
		System.out.println("Colunas: " + qtdColunas);
		
		//Percorrer as linhas:
		for (int i = 0; i < qtdLinhas; i++) {
//			System.out.println(matriz[i]); //Aqui o i está indo em cada linha.	
			for (int j = 0; j < qtdColunas; j++) {
				System.out.println(matriz[i][j] = 5); //Toda linha e coluna irá atribuir o 5.
			}
		}
		
		
	}

}
