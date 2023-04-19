package logica.exercicio.aula05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//▪ Elabore um programa no qual o usuário entre com um número.
		//▪ Após isso seu script deverá exibir o número digitado e sua respectiva separação em centena, dezena e unidade.
		//▪ Exemplo: se o usuário digitar o número 729, deverá ser exibido na tela:
		//▪ Centena = 700
		//▪ Dezena = 20
		//▪ Unidade = 9

		//▪ Obs.: considere que o usuário irá digitar números somente até 999.
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um número (até 999): ");
		int num = sc.nextInt();
				
		int	centena = num / 100;
		int	dezena = (num%100)/10;
		int	unidade = ((num%100)%10);
		
		System.out.println("O valor de " + num + " em: "
				+ "\n" + "Centena: " + centena + "00"
				+ "\n" + "Dezena: " + dezena + "0"
				+ "\n" + "Unidade: " + unidade);
		
		
	}

}
