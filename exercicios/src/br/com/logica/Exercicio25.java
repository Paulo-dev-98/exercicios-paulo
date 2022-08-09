package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio25 {

	public static void main(String[] args) {

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));

		if (numero1 == numero2) {
			System.out.println("--------------------------");
			System.out.println("Os Dois numeros são iguais");
			System.out.println("--------------------------");
		} else if (numero1 != numero2) {
			System.out.println("-------------------------");
			System.out.println("Os numeros são diferentes");
			System.out.println("-------------------------");
			System.out.println("O primeiro numero é: " + numero1);
			System.out.println("-------------------------");
			System.out.println("O segundo numero é: " + numero2);
			if (numero1 > numero2) {
				System.out.println("---------------------------------------");
				System.out.println("O primeiro numero é maior que o segundo");
				System.out.println("---------------------------------------");
			} else {
				System.out.println("---------------------------------------");
				System.out.println("O segundo numero é maior que o primeiro");
				System.out.println("---------------------------------------");
			}
		}
	}
}
