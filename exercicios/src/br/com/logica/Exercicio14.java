package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio14 {

	public static void main(String[] args) {

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero para verifica��o"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero para verifica��o"));

		System.out.println("============================");
		System.out.println("O primeiro algorismo �: " + numero1);
		System.out.println("============================");
		System.out.println("O segundo algorismo �: " + numero2);
		
		if (numero1 > numero2) {
			System.out.println("-------------------------------------------");
			System.out.println("O primeiro algorismo e maior que o segundo");
			System.out.println("-------------------------------------------");
		} else if (numero2 > numero1) {
			System.out.println("-------------------------------------------");
			System.out.println("O segundo algorismo e maior que o primeiro");
			System.out.println("-------------------------------------------");
		} else if (numero1 == numero2) {
			System.out.println("-------------------------------------------");
			System.out.println("Os dois algorismos s�o iguais");
			System.out.println("-------------------------------------------/;");
		}

	}

}
