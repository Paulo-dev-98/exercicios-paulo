package br.com.logica;

import java.util.Scanner;

public class ExercicioInversaoArray {

	public static void main(String[] args) {
		
    // criar uma condição que não deixa seguir o programa caso o usuario digite um numero repetido(pendente)

    // Esse exercicio inverte a ordem de um array

		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[3];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("----------------");
			System.out.println("digite um numero");
			numeros[i] = teclado.nextInt();
		}
		System.out.println("Agora a ordem invertida: ");
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println("------------------------");
			System.out.println(numeros[i]);
		}
		teclado.close();
	}

}
