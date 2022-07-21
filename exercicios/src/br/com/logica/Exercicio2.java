package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		
		   int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
		   int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
		   int soma = numero1 + numero2;
		   int subtracao = numero1 - numero2;;
		   int multiplicacao = numero1 * numero2;
		   int divisao = numero1 / numero2;
		   
		   System.out.println(soma);
		   System.out.println(subtracao);
		   System.out.println(multiplicacao);
		   System.out.println(divisao);

	}
}
