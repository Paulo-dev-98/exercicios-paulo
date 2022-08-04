package br.com.logica;

import java.util.Scanner;

public class ExercicioArray1 {

	/*
	 * Escreva um programa para ler 3 valores interios e escrev�-los em ordem
	 * crescente.
	 */

	/*
	 * O programa l� tr�s valores e mostra em ordem crescente ou decrescente se n�o
	 * estiver em nenhuma das duas, ele simplismente mostrara uma mensagem que n�o
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
			System.out.println("os numeros em ordem crescente s�o:");
			for (int elementos : numeros) {
				System.out.println("-------------------------------------");
				System.out.println(elementos);
			}
		} else if (numeros[0] > numeros[1] && numeros[2] < numeros[1]) {
			System.out.println("os numeros em ordem decrescente s�o:");
			for (int elementos : numeros) {
				System.out.println("--------------------------------------");
				System.out.println(elementos);
			}
		} else {
			System.out.println("----------------------------------------------------------");
			System.out.println("Os numeros n�o est�o em ordem crescente e nem decrescente");
		}
		teclado.close();
	}
}
