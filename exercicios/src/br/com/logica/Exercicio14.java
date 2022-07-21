package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio14 {

	public static void main(String[] args) {

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero para verificação"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero para verificação"));

		if (numero1 > numero2) {
			System.out.println("O primeiro algorismo e maior que o segundo");
		} else if (numero2 > numero1) {
			System.out.println("O segundo algorismo e maior que o primeiro");
		} else if (numero1 == numero2) {
			System.out.println("Os dois algorismos são iguais");
		}

	}

}
