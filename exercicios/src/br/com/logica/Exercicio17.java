package br.com.logica;

import java.util.Random;

public class Exercicio17 {
	public static void main(String[] args) {

		Random aleatorio = new Random();

		int quantidadeIntervalo = 0;

		for (int i = 0; i < 80; i++) {
			int numero = aleatorio.nextInt(500);
			if (numero >= 10 && numero <= 150) {
				quantidadeIntervalo++;
				System.out.println("================================================");
				System.out.println("esse numero pertence ao grupro entre 10 e 150");
			} else {
				System.out.println("================================================");
				System.out.println("esse numero não pertence ao grupo entre 10 e 150");
			}
		}
		System.out.println("==============================================================");
		System.out.println("dentro de 80 numero a quantidade que esta entre 10 e 150 é: " + quantidadeIntervalo);
		System.out.println("==============================================================");
	}

}
