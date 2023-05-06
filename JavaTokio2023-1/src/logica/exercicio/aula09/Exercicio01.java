package logica.exercicio.aula09;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		▪ Considerando o trecho de código Java representado a seguir:

		int[] v = {2, 0, 3, 9};
		v[v[2]] = v[v[1]];
		
		for (int i: v) {
			System.out.print(i);
		}

//			▪ O que será impresso na tela?
//			X) 2 0 3 2
		
	}

}
