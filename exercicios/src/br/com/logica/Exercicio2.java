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
		   System.out.println("a soma do primeiro mais o segundo numero é: " + soma);
		   System.out.println("----------------------------------------------------------------");
		   System.out.println("a subtração do primeiro menos o segundo numero é: " + subtracao);
		   System.out.println("----------------------------------------------------------------");
		   System.out.println("a multiplicação do primeiro pelo segundo numero é: " + multiplicacao);
		   System.out.println("----------------------------------------------------------------");
		   System.out.println("a divisão do primeiro pelo segundo numero é: " + divisao);
		   System.out.println("----------------------------------------------------------------");
	}
}
