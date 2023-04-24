package logica.exercicio.aula06;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//▪ Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
			//▪ Salários até R$ 280,00 (incluindo): aumento de 20%.
			//▪ Salários entre R$ 280,00 e R$ 700,00: aumento de 15%.
			//▪ Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%.
			//▪ Salários de R$ 1500,00 em diante: aumento de 5%.
		
		//▪ Após o aumento ser realizado, informe na tela:
			//▪ O salário antes do reajuste.
			//▪ O percentual de aumento aplicado.
			//▪ O valor do aumento.
			//▪ O novo salário, após o aumento.
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o seu salário: ")); 
		
		double aumento20 = (salario * 20/100);
		double aumento15 = (salario * 15/100);
		double aumento10 = (salario * 10/100);
		double aumento5 = (salario * 5/100);

		if (salario <= 280) {
			JOptionPane.showMessageDialog(null, String.format("O seu salário antes reajuste: R$ %.2f", salario));
			JOptionPane.showMessageDialog(null, "O percentual de aumento é de 20%.");
			JOptionPane.showMessageDialog(null, String.format("Valor do aumento: R$ %.2f ", aumento20));
			JOptionPane.showMessageDialog(null, String.format("O seu salário após o aumento é de: R$ %.2f ", (salario + aumento20)));
		} else if (salario > 280 && salario <= 700) {
			JOptionPane.showMessageDialog(null, String.format("O seu salário antes reajuste: R$ %.2f", salario));
			JOptionPane.showMessageDialog(null, "O percentual de aumento é de 15%.");
			JOptionPane.showMessageDialog(null, String.format("Valor do aumento: R$ %.2f ", aumento15));
			JOptionPane.showMessageDialog(null, String.format("O seu salário após o aumento é de: R$ %.2f ", (salario + aumento15)));
		} else if (salario > 700 && salario < 1500) {
			JOptionPane.showMessageDialog(null, String.format("O seu salário antes reajuste: R$ %.2f", salario));
			JOptionPane.showMessageDialog(null, "O percentual de aumento é de 10%.");
			JOptionPane.showMessageDialog(null, String.format("Valor do aumento: R$ %.2f ", aumento10));
			JOptionPane.showMessageDialog(null, String.format("O seu salário após o aumento é de: R$ %.2f ", (salario + aumento10)));
		} else if (salario >= 1500) {
			JOptionPane.showMessageDialog(null, String.format("O seu salário antes reajuste: R$ %.2f", salario));
			JOptionPane.showMessageDialog(null, "O percentual de aumento é de 5%.");
			JOptionPane.showMessageDialog(null, String.format("Valor do aumento: R$ %.2f ", aumento5));
			JOptionPane.showMessageDialog(null, String.format("O seu salário após o aumento é de: R$ %.2f ", (salario + aumento5)));
		} else {
			JOptionPane.showMessageDialog(null, "Opção inválida.");
		}
		
	}

}
