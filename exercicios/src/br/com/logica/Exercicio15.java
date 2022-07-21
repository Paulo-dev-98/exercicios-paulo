package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio15 {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero para verificação"));

		if (numero >= 100 && numero <= 200) {
			System.out.println("este numero esta entre 100 e 200");
		} else {
			System.out.println("este numero é maior que 200 ou menor que 100");
		}

	}

}
