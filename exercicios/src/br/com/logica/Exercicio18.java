package br.com.logica;

import java.util.Random;

public class Exercicio18 {

	public static void main(String[] args) {
		
		int maiorIdade = 0;
		int menorIdade = 0;
		

		Random aleatorio = new Random();

		for (int i = 0; i <= 75; i++) {
			int idade = aleatorio.nextInt(75);
			String nome = "pessoa" + (i + 1);
			if (idade < 18) {
				menorIdade++;
				System.out.println("-------------------------");
				System.out.println(nome + " é menor de idade");
			} else {
				maiorIdade++;
				System.out.println("-------------------------");
				System.out.println(nome + " é maior de idade");
			}
          
		}
		System.out.println("-------------------------------");
		System.out.println(menorIdade + " pessoas são menores de idade\n"
		+ maiorIdade + " pessoas são maiores de idade" );
		System.out.println("-------------------------------");
	}

}
