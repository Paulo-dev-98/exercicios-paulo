package br.com.logica;

import java.util.Random;

public class Exercicio19 {

	public static void main(String[] args) {
		int homens = 0;
		int mulheres = 0;

		Random aleatorio = new Random();

		for (int i = 0; i < 56; i++) {
			int sexo = aleatorio.nextInt(2);
			String nome = "pessoa " + (i + 1);
			if (sexo == 0) {
				homens++;
				System.out.println(nome + " é um homem");
			} else {
				mulheres++;
				System.out.println(nome + " é uma mulher");
			}
		}

		System.out.println(homens + " pessoas são homens\n" + mulheres + " pessoas são mulheres");

	}

}
