package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		
		double precoDeCusto = Double.parseDouble(JOptionPane.showInputDialog("digite o pre�o de custo"));
		double percentualDoJuros = Double.parseDouble(JOptionPane.showInputDialog("digite a porcentagem do juros exemplo: 0.5 = 50%"));
		double juros = precoDeCusto * percentualDoJuros;
		double valorDeVenda = precoDeCusto + juros;
		
		System.out.println("O pre�o de custo do produto �: " + precoDeCusto);
		System.out.println("O valor do percentual de juros � : " + percentualDoJuros);
		System.out.println("O valor do juros �: " + juros);
		System.out.println("O valor final do produto �:  " + valorDeVenda);

	}

}

