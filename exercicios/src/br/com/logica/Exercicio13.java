package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero para verifica��o"));

		if (numero > 10) {
			System.out.println("=============================");
			System.out.println("Este � um numero maior que 10");
			System.out.println("=============================");
		} else {
			System.out.println("=============================");
			System.out.println("Este � um numero menor que 10");
			System.out.println("=============================");
		}

	}

}
