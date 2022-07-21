package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de b"));
	
		a =  a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("valor de a: " + a);
		System.out.println("valor de b: " + b);
		
		
	}

}
