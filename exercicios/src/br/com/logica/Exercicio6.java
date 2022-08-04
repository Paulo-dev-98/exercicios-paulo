package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de b"));
	
		a =  a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("=============================================================");
		System.out.println("Neste momento o valor de 'a' passa a ser o valor de 'b': " + a);
		System.out.println("=============================================================");
		System.out.println("Neste momento o valor de 'b' passa a ser o valor de 'a': " + b);
		System.out.println("=============================================================");
		
		
	}

}
