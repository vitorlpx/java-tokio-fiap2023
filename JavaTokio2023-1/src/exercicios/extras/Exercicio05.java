package exercicios.extras;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//5. Um robô de combate só deve ativar sua arma principal quando o inimigo está a menos de
		//70cm de distância. Faça um programa onde o usuário informe a distância do inimigo e sejam
		//exibidas as mensagens “ATIVADO” ou “DESATIVADO” dependendo do status da arma.
				
		Scanner sc = new Scanner(System.in);
				
		int distancia;
				
		System.out.println("Informe a distância do inimigo (distância vai converter pra m): ");
		distancia = sc.nextInt();
				
		if(distancia <= 70 ) {
			System.out.println("A arma está ativada!");
		} else {
			System.out.println("A arma não está desativada.");
		}

	}

}


