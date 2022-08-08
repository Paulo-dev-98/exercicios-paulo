package br.com.logica;

import java.security.SecureRandom;

public class ExemploMatrizBidimencional {

	public static void main(String[] args) {

		// trabalhando com constantes
		// constante linhas
		final int linhas = 5;
		// constante colunas
		final int colunas = 3;
		// matriz
		int[][] numeros = new int[linhas][colunas];

		// preenchendo a matriz
		// primeiro for preenche a linha
		// segundo for preenche a coluna
		// ex: linha 0 = coluna 0, linha 0 = coluna 1 assim por diante
		// ex: linha 1 = coluna 0, linha 1 = coluna 1 assim por diante
		for (int l = 0; l < linhas; l++) {
			for (int c = 0; c < colunas; c++) {
				numeros[l][c] = new SecureRandom().nextInt(100);
			}
		}

		for (int l = 0; l < linhas; l++) {
			for (int c = 0; c < colunas; c++) {
				System.out.printf("%d - ", numeros[l][c]);
			}
			System.out.printf("%n");
		}

	}

}
