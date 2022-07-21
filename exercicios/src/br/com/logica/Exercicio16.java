package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio16 {

	public static void main(String[] args) {

		String nomeDoAluno = JOptionPane.showInputDialog("digite o nome do aluno");
		Double nota1 = Double.parseDouble(JOptionPane.showInputDialog("digite a nota 1 entre os valores 0 e 10"));
		Double nota2 = Double.parseDouble(JOptionPane.showInputDialog("digite a nota 2 entre os valores 0 e 10"));
		Double nota3 = Double.parseDouble(JOptionPane.showInputDialog("digite a nota 3 entre os valores 0 e 10"));
		Double mediaDoAluno = (nota1 + nota2 + nota3) / 3;

		System.out.println("O nome do aluno é: " + nomeDoAluno);
		System.out.println("A nota da primeira prova é: " + nota1);
		System.out.println("A nota da segunda prova é: " + nota2);
		System.out.println("A nota da terceira prova é: " + nota3);
		System.out.println("A media total deste aluno é: " + mediaDoAluno);

		if (mediaDoAluno >= 7) {
			System.out.println("O aluno foi aprovado, Parabéns!");
		} else if (mediaDoAluno <= 5) {
			System.out.println("O aluno foi reprovado, Estude mais!");
		} else if (mediaDoAluno >= 5.1 && mediaDoAluno <= 6.9) {
			System.out.println("O aluno esta de recuperação");
		}

	}

}
