package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		
		/*
		 * Essa questão não pede a logica condicional feita pelo if else, so fiz por que já havia feito
		 * uma questão semelhante e queria ver se lembrava como se faz sem consultar outros meios.
		 * OBS: na condicional coloquei o valor ipotetico de que cada prova vale 100 pontos e o aluno precisa de
		 * uma media de 60.
		 */
		
		String nomeDoAluno = JOptionPane.showInputDialog("digite o nome do aluno");
		Double primeiraProva = Double.parseDouble(JOptionPane.showInputDialog("digite a nota da primeira prova"));
		Double segundaProva = Double.parseDouble(JOptionPane.showInputDialog("digite a nota da segunda prova"));
		Double terceiraProva = Double.parseDouble(JOptionPane.showInputDialog("digite a nota da terceira prova"));
		Double mediaDoAluno = (primeiraProva + segundaProva + terceiraProva) / 3;
		
		
		System.out.println("O nome do aluno é: " + nomeDoAluno);
		System.out.println("A nota da primeira prova é: " + primeiraProva);
		System.out.println("A nota da segunda prova é: " + segundaProva);
		System.out.println("A nota da terceira prova é: " + terceiraProva);
		System.out.println("A media total deste aluno é: " + mediaDoAluno);
		
		
		if (mediaDoAluno >= 60) {
			System.out.println("O aluno foi aprovado, Parabéns!");
		} else {
			System.out.println("O aluno foi reprovado, Estude mais!");
		}

	}

}
