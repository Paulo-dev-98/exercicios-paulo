package br.com.logica;

import javax.swing.JOptionPane;

public class ExercicioEquacaoDoSegundoGrau {
	
	public static void main(String[] args) {
		
		double a  = Double.parseDouble(JOptionPane.showInputDialog("digite o indice A"));
		double b  = Double.parseDouble(JOptionPane.showInputDialog("digite o indice B"));
		double c  = Double.parseDouble(JOptionPane.showInputDialog("digite o indice C"));
		double delta = ((b*b) - (4*a*c));
		double raizDeDelta = Math.sqrt(delta);
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("------------------------------------------");
		System.out.println("O valor de A �: " + a);
		System.out.println("------------------------------------------");
		System.out.println("O valor de B �: " + b);
		System.out.println("------------------------------------------");
		System.out.println("O valor de C �: " + c);
		System.out.println("------------------------------------------");
		System.out.println("O valor de Delta �: " + delta);
		System.out.println("------------------------------------------");
		System.out.println("O valor da raiz de delta �: " + raizDeDelta);
		System.out.println("------------------------------------------");
		System.out.println("O valor de X Linha 1 �: " + x1);
		System.out.println("------------------------------------------");
		System.out.println("O valor de X Linha 2 �: " + x2);
		System.out.println("------------------------------------------");
		
	}

}
