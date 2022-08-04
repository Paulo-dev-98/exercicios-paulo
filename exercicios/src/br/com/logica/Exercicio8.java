package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio8 {
	
	public static void main(String[] args) {
		double cotacaoDoDolar = Double.parseDouble(JOptionPane.showInputDialog("digite a cotação atual do dolar"));
		double valorEmDolar = Double.parseDouble(JOptionPane.showInputDialog("digite o valor em dolar"));
		double valorEmReais = cotacaoDoDolar * valorEmDolar;
		
		System.out.println("=====================================");
        System.out.println("O valor em dolares é: " + valorEmDolar);	
        System.out.println("=====================================");
        System.out.println("A cotação do dolar é: " + cotacaoDoDolar);
        System.out.println("=======================================================");
		System.out.println("O valor de reais convertido do dolar é: " + valorEmReais);
		System.out.println("=======================================================");
	}

}
