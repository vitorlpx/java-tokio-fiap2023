package logica.exercicio.aula06;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {

		int estado, codigo; 
		double peso, precoCarga = 0, pesoCarga, calcImposto = 0, valorTotal;
		
		
		do {
			estado = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número de 1 a 5 para definir o estado: "));
			
			if (estado < 1 || estado > 5) {
			JOptionPane.showMessageDialog(null, "Erro, informe um número válido");
			}
		} while (estado < 1 || estado > 5);
		
		
		peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da carga em Toneladas: "));
		
		do {
			codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o código da carga (de 10 à 40): "));
			
			if (codigo < 10 || codigo > 40) {
			JOptionPane.showMessageDialog(null, "Erro, informe um código válido");
			}
		} while (codigo < 10 || codigo > 40);
		
		pesoCarga = peso * 1000;
		
		if (codigo >= 10 || codigo <= 20 ) {
			precoCarga = pesoCarga * 100;
		} else if (codigo >= 21 || codigo <=30) {
			precoCarga = pesoCarga * 250;
		} else if (codigo >= 31 || codigo <= 40) {
			precoCarga = pesoCarga * 340;
		}
		
		if (estado == 1) {
			calcImposto = (precoCarga * 0.35);
		} else if (estado == 2) {
			calcImposto = (precoCarga * 0.25);
		} else if (estado == 3) {
			calcImposto = (precoCarga * 0.15);
		} else if (estado == 4) {
			calcImposto = (precoCarga * 0.05);
		} else {
			JOptionPane.showMessageDialog(null, "Código 5! Isento de imposto!");
		}
		
		valorTotal = precoCarga + calcImposto;
		
		JOptionPane.showMessageDialog(null, String.format("O valor de imposto é: %.2f", calcImposto)
				+ String.format("\nO valor total transportado é: %.2f \n", valorTotal));
	
	}

}
