package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio12 {
	
	public static void main(String[] args) {
		double precoDeCusto = Double.parseDouble(JOptionPane.showInputDialog("digite o pre�o de custo do carro"));
		double impostoDaFabrica = precoDeCusto * 0.45;
		double impostoDaDistribuidora = precoDeCusto * 0.28;
		double valorFinalDoCarro = precoDeCusto + impostoDaFabrica + impostoDaDistribuidora;
		
		System.out.println("----------------------------------------------------------");
		System.out.println("O pre�o de custo do carro �: R$" + precoDeCusto);
		System.out.println("----------------------------------------------------------");
		System.out.println("O valor do imposto da fabrica �: R$" + impostoDaFabrica);
		System.out.println("----------------------------------------------------------");
		System.out.println("O valor do imposto da distribuidora �: R$" + impostoDaDistribuidora);
		System.out.println("----------------------------------------------------------");
		System.out.println("O valor final do carro �: R$" + valorFinalDoCarro);
		System.out.println("----------------------------------------------------------");

	}

}
