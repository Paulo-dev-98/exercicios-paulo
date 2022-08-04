package br.com.logica;

import java.util.Scanner;

public class ExercicioArray1 {

	/*
	 * Escreva um programa para ler 3 valores interios e escrevê-los em ordem
	 * crescente.
	 */

	/*
	 * O programa lê três valores e mostra em ordem crescente ou decrescente se não
	 * estiver em nenhuma das duas, ele simplismente mostrara uma mensagem que não
	 * esta em nenhuma das ordens mencionadas acima.
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[3];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("----------------");
			System.out.println("digite um numero");
			numeros[i] = teclado.nextInt();
		}

		if (numeros[0] < numeros[1] && numeros[2] > numeros[1]) {
			System.out.println("os numeros em ordem crescente são:");
			for (int elementos : numeros) {
				System.out.println("-------------------------------------");
				System.out.println(elementos);
			}
		} else if (numeros[0] > numeros[1] && numeros[2] < numeros[1]) {
			System.out.println("os numeros em ordem decrescente são:");
			for (int elementos : numeros) {
				System.out.println("--------------------------------------");
				System.out.println(elementos);
			}
		} else {
			System.out.println("----------------------------------------------------------");
			System.out.println("Os numeros não estão em ordem crescente e nem decrescente");
		}
		teclado.close();
	}
}
