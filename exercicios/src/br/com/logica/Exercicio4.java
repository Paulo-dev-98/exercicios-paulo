package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("digite o nome do vendedor");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("digite o salario do vendedor"));
		double ValorDasVendasEfeutadas = Double.parseDouble(JOptionPane.showInputDialog("digite o valor das vendas efetuadas pelo vendedor"));
		double comisao = ValorDasVendasEfeutadas * 0.15;
		double salarioFinal = salario + comisao;
		
		System.out.println("O nome do vendedor �: " + nome);
		System.out.println("O salario fixo do vendedor �: " + salario);
		System.out.println("O valor de vendas em dinheiro do vendodor �: R$" +ValorDasVendasEfeutadas);
		System.out.println("O valor da comiss�o �: " + comisao);
		System.out.println("O salario final do vendedor com a comissao �:" + salarioFinal);
	}

}
