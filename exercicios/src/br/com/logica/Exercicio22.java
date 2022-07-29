package br.com.logica;

import java.util.Random;

public class Exercicio22 {
	
	public static void main(String[] args) {
		
		String[] nomeDoProduto = new String[39];
		double[] precoDeCusto = new double[39];
		double[] precoDeVenda = new double[39];
		double valorTotalDeCusto = 0;
		double valorTotalDeVenda = 0;
		Random aleatorio = new Random();
		
		for (int i = 0; i < nomeDoProduto.length; i++) {
            nomeDoProduto[i] = "produto " + (i + 1);
            precoDeCusto[i] = aleatorio.nextInt(500);
            int x = aleatorio.nextInt(3);
            if(x == 1) {
            	precoDeVenda[i] = precoDeCusto[i] - (precoDeCusto[i] * - 0.10);
            } else if(x == 2) {
            	precoDeVenda[i] = precoDeCusto[i];
            } else {
            	precoDeVenda[i] = precoDeCusto[i] + (precoDeCusto[i] * 0.10);
            }
			System.out.println(nomeDoProduto[i] + " - " + precoDeCusto[i] + " - " +  precoDeVenda[i]);
		}
		
		for (int i = 0; i < precoDeCusto.length; i++) {
			valorTotalDeCusto += precoDeCusto[i]; 
			valorTotalDeVenda += precoDeVenda[i];
		}
		
		if(valorTotalDeCusto > valorTotalDeVenda) {
			System.out.println("prejuizo de: " + (valorTotalDeVenda - valorTotalDeCusto));
		} else if(valorTotalDeVenda > valorTotalDeCusto) {
			System.out.println("lucro de: " + (valorTotalDeVenda - valorTotalDeCusto));
		} else {
			System.out.println("empate");
		}
		
		System.out.println("a media do valor de custo é: " + (valorTotalDeCusto/40));
		System.out.println("a media do valor de venda é: " + (valorTotalDeVenda/40));
		
		// Entrada: 40 produtos (preço de custo e preço venda)
		// Processamento: preciso do lucro, prejuizo ou empate
		// saida: o valor de venda, o preço de custo, e a media dos dois.
	}

}
