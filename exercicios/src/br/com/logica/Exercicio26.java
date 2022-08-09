package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio26 {
	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
		if (numero > 5 || numero == 0) {
			System.out.println("Numero Invalido");
		} else {
			switch (numero) {
			case 1:
				System.out.println("Um");
				break;
			case 2:
				System.out.println("Dois");
				break;
			case 3:
				System.out.println("Três");
				break;
			case 4:
				System.out.println("Quatro");
				break;
			case 5:
				System.out.println("Cinco");
				break;
			default:
				System.out.println("Algo de errado não esta certo");
				break;
			}
		}
	}
}
