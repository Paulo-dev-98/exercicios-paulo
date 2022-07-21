package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio10 {
	public static void main(String[] args) {
         
		double valorDaCompra = Double.parseDouble(JOptionPane.showInputDialog("digite o valor da compra"));
		double numeroDeParcelas = valorDaCompra/5;
		System.out.println("sua compra foi dividida em cinco parcelas de: " + numeroDeParcelas);
		
	}
}
