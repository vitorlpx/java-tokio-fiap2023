package logica.aulas.aula08;

public class StringClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "FIAP Paulista";
		
		int tamanhoStr = str.length();
		System.out.println("Tamanho da str:" + tamanhoStr);
		
		for (int i = 0; i < tamanhoStr; i++) { //Percorrer a string.
			System.out.println(str.charAt(i));
		}
		
	}

}
