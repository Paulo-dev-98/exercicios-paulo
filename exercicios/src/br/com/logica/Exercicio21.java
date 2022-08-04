package br.com.logica;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio21 {

	public static void main(String[] args) {

		String nome = "pessoa ";
		String indentidade;
		boolean sexo;
		int idade;
		int saude;
		int totalQuePodemServir = 0;
		int totalQueNaoPodemServir = 0;
		String servicoMilitar;
		Random aleatorio = new Random();
		int pessoas = Integer.parseInt(JOptionPane.showInputDialog("digite o numero de pessoas"));

		for (int i = 0; i < pessoas; i++) {
			nome = "pessoa " + (i + 1);
			sexo = aleatorio.nextBoolean();
			if (sexo == true) {
				indentidade = "masculino";
			} else {
				indentidade = "feminino";
			}
			idade = aleatorio.nextInt(100);
			saude = aleatorio.nextInt(100);

			if (idade >= 18 && idade <= 23 && saude >= 60) {
				totalQuePodemServir++;
				servicoMilitar = "Sim";
			} else {
				totalQueNaoPodemServir++;
				servicoMilitar = "Não";
			}

			System.out.println(nome + ", idade: " + idade + ", sexo: " + indentidade + ", saude: " + saude
					+ " pode Servir: " + servicoMilitar);
			System.out.println("-------------------------------------------------------------------");
		}
		System.out.println("O Total de pessoas que podem servir é: " + totalQuePodemServir);
		System.out.println("O Total de pessoas que não podem servir é: " + totalQueNaoPodemServir);
		System.out.println("-------------------------------------------------------------------");
	}

}
