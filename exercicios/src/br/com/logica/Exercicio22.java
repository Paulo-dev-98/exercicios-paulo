package br.com.logica;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio22 {
	
	public static void main(String[] args) {
		
		String[] nomeDoProduto = new String[40];
		double[] precoDeCusto = new double[40];
		double[] precoDeVenda = new double[40];
		double valorTotalDeCusto = 0;
		double valorTotalDeVenda = 0;
		Random aleatorio = new Random();
		DecimalFormat formatador = new DecimalFormat("#,##0.00");
		
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
            System.out.println("---------------------------");
			System.out.println(nomeDoProduto[i] + " - " + precoDeCusto[i] + " - " +  precoDeVenda[i]);
		}
		
		for (int i = 0; i < precoDeCusto.length; i++) {
			valorTotalDeCusto += precoDeCusto[i]; 
			valorTotalDeVenda += precoDeVenda[i];
		}
		
		if(valorTotalDeCusto > valorTotalDeVenda) {
			System.out.println("-----------------------------");
			System.out.println("prejuizo de: " + formatador.format(valorTotalDeVenda - valorTotalDeCusto));
			System.out.println("-----------------------------");
		} else if(valorTotalDeVenda > valorTotalDeCusto) {
			System.out.println("-----------------------------");
			System.out.println("lucro de: " + formatador.format(valorTotalDeVenda - valorTotalDeCusto));
			System.out.println("-----------------------------");
		} else {
			System.out.println("-----------------------------");
			System.out.println("empate");
			System.out.println("--------------------------------");
		}
		
		System.out.println("a media do valor de custo é: " + formatador.format(valorTotalDeCusto/40));
		System.out.println("------------------------------------");
		System.out.println("a media do valor de venda é: " + formatador.format(valorTotalDeVenda/40));
		System.out.println("------------------------------------");
		
		
		// Entrada: 40 produtos (preço de custo e preço venda)
		// Processamento: preciso do lucro, prejuizo ou empate
		// saida: o valor de venda, o preço de custo, e a media dos dois.
	}

}
