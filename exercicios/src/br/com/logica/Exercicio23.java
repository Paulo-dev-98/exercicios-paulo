package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio23 {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));

		if (numero > 80 || numero < 25 || numero == 40) {
			if (numero > 80) {
				System.out.println("========================");
				System.out.println("numero � maior do que 80");
				System.out.println("========================");
			} else if (numero < 25) {
				System.out.println("=====================");
				System.out.println("numero � menor que 25");
				System.out.println("=====================");
			} else if (numero == 40) {
				System.out.println("===================");
				System.out.println("numero � igual a 40");
				System.out.println("===================");
			}
		} else {
			System.out.println("=====================================================================");
			System.out.println("este numero n�o � maior que 80, n�o � menor que 25 e n�o e igual a 40");
			System.out.println("=====================================================================");
		}

	}
}
