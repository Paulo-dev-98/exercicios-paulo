package br.com.logica;

import java.util.Scanner;

public class ExercicioMatrizCadeiraDeCinema {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String[][] cinema = new String[10][10];
		int opcao = 0, fila = 0, poltrona = 0;

		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema.length; j++) {
				cinema[i][j] = "O";
			}
		}
		do {
			System.out.println("1- Reservar \n2- Layout do Cinema \n3- Sair ");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Escolha a fila: ");
				fila = entrada.nextInt();
				System.out.print("Ecolha a poltrona: ");
				poltrona = entrada.nextInt();

				if (cinema[fila][poltrona].equals("O")) {
					cinema[fila][poltrona] = "X";
				} else {
					System.out.println("--------------------");
					System.out.println("Poltrona já ocupada.");
					System.out.println("--------------------");
				}
				break;
			case 2:
				for (int i = 0; i < cinema.length; i++) {
					for (int j = 0; j < cinema.length; j++) {
						System.out.print(cinema[i][j]);
					}
					System.out.println();
				}
				break;
			case 3:
				System.out.println("-------------------");
				System.out.println("Programa Finalizado");
				System.out.println("-------------------");
				break;
			default:
				System.out.println("---------------------");
				System.err.println("Esta Opção é invalida");
				System.out.println("---------------------");
			}
		} while (opcao != 3);
		entrada.close();
	}
}
