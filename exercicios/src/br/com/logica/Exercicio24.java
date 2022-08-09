package br.com.logica;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int escolha = 0;

		while (escolha != 2) {
			System.out.println("----------------");
			System.out.println("digite um numero");
			numero = teclado.nextInt();
			if (numero % 2 == 0) {
				System.out.println("-----------------");
				System.out.println("Este numero é par");
			} else if (numero % 2 != 0) {
				System.out.println("-------------------");
				System.out.println("Este numero é impar");
			} else {
				System.out.println("-");
				System.out.println("0");
			}
			System.out.println("---------------------");
			System.out.println("1 - Repita o processo \n2 - sair");
			escolha = teclado.nextInt();
		}
		System.out.println("-------------------");
		System.out.println("Programa Finalizado");
		System.out.println("-------------------");
		teclado.close();
	}

}
