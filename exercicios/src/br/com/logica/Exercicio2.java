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
		   
		   System.out.println("----------------------------------------------------------------");
		   System.out.println("a soma do primeiro mais o segundo numero �: " + soma);
		   System.out.println("----------------------------------------------------------------");
		   System.out.println("a subtra��o do primeiro menos o segundo numero �: " + subtracao);
		   System.out.println("----------------------------------------------------------------");
		   System.out.println("a multiplica��o do primeiro pelo segundo numero �: " + multiplicacao);
		   System.out.println("----------------------------------------------------------------");
		   System.out.println("a divis�o do primeiro pelo segundo numero �: " + divisao);
		   System.out.println("----------------------------------------------------------------");
	}
}
