package logica.exercicio.aula06;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		▪ Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida 
//		pelo automóvel e o total de combustível gasto.

//		▪ Dê sua resposta em km por litro de combustível (km/Litro)

//		▪ Caso a autonomia do veículo esteja abaixo de 8 km/L, exiba a mensagem:
//		▪ “Esse carro bebe hein!”
//		▪ Senão, exiba a mensagem:
//		▪ “Autonomia legal”

		double distanciaKm = Double.parseDouble(JOptionPane.showInputDialog(null, "Coloque a distância da viagem em km: "));
		double combustivelGasto = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o  total de combustível gasto: "));
		
		double kmPorLitro = (distanciaKm / combustivelGasto);
		
		if (kmPorLitro <= 8) {
			JOptionPane.showMessageDialog(null, "Esse carro bebe hein!");
		} else {
			JOptionPane.showMessageDialog(null, "Autonomia legal.");
		}
		
	}

}
