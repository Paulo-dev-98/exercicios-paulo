package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio1 {
 
	public static void main(String[] args) {
	   int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
	   int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
	   int soma = numero1 + numero2;
	   System.out.println(soma);
	}
	
}
