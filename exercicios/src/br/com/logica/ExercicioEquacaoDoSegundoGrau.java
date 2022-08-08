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
		System.out.println("O valor de A é: " + a);
		System.out.println("------------------------------------------");
		System.out.println("O valor de B é: " + b);
		System.out.println("------------------------------------------");
		System.out.println("O valor de C é: " + c);
		System.out.println("------------------------------------------");
		System.out.println("O valor de Delta é: " + delta);
		System.out.println("------------------------------------------");
		System.out.println("O valor da raiz de delta é: " + raizDeDelta);
		System.out.println("------------------------------------------");
		System.out.println("O valor de X Linha 1 é: " + x1);
		System.out.println("------------------------------------------");
		System.out.println("O valor de X Linha 2 é: " + x2);
		System.out.println("------------------------------------------");
		
	}

}
