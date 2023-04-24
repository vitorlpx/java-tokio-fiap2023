package logica.exercicio.aula06;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//▪ Faça um algoritmo que calcule o valor da conta de luz de uma pessoa, empresa etc.
		//▪ Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
	
		//1 - Residência: 0,60;
		//2 - Comércio: 0,48;
		//3 - Indústria: 1,29;
		
		double kwH = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o cálculo em kw/h: ")); 
		//ParseDouble é para converter, pois o JOption só aceita string.
		
		double calcResidencia = kwH * 0.60;
		double calcComercio = kwH * 0.48;
		double calcIndustria = kwH * 1.29;
		
		String options = JOptionPane.showInputDialog(null, "Escolha uma das opções:  "
				+ "\n" + "1 - Residência;"
				+ "\n" + "2 - Comércio;"
				+ "\n" + "3 - Indústria.");
		
		switch (options) {
			case "1":
				JOptionPane.showMessageDialog(null, String.format("Você escolheu residência. \nO valor total em kw/h é: R$%.2f", calcResidencia));
				//String.format serve para manipular o double.
			break;
			
			case "2":
				JOptionPane.showMessageDialog(null, String.format("Você escolheu comércio. \nO valor total em kw/h é: R$%.2f", calcComercio));
			break;
				
			case "3":
				JOptionPane.showMessageDialog(null, String.format("Você escolheu indústria. \nO valor total em kw/h é: R$%.2f", calcIndustria));
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Escolha um valor válido!");
		}
		
	}

}
