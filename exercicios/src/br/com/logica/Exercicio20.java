package br.com.logica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double valorDesconto = 0;
		double ValorCarroComDesconto = 0;
		DecimalFormat formatador = new DecimalFormat("#,##0.00");

		String[] carros = { "fiat", "siena", "nissan", "ford", "fusca" };
		int[] ano = { 2000, 2001, 2002, 2003, 2004, 2005 };
		double[] valor = { 30000, 40000, 50000, 60000, 70000 };

		System.out.println("===============================================================");
		System.out.println("================= Bem Vindo a Carango Velho ===================");
		System.out.println("===============================================================");
		System.out.println("Escolha um carro");
		System.out.println("---------------------------------------------------------------");
		System.out.println("modelo do carro \tano \t\tvalor");

		for (int i = 0; i < valor.length; i++) {
			System.out.println((i + 1) + " - " + carros[i] + "\t\t" + ano[i] + "\t\t" + valor[i]);
		}
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("escolha o numero de um carro ");
		int escolha = teclado.nextInt();

		if (ano[escolha - 1] <= 2000) {
			valorDesconto = valor[escolha - 1] * 0.12;
		} else {
			valorDesconto = valor[escolha - 1] * 0.07;
		}
		
		System.out.println("deseja aplicar o desconto? ");
		teclado.nextLine();
		String opcao = teclado.nextLine();
		
        while(opcao.equalsIgnoreCase("S")) {
        	ValorCarroComDesconto = valor[escolha - 1] - valorDesconto;
        	System.out.println("deseja continuar aplicando o desconto? ");
        	opcao = teclado.nextLine();
        }
		teclado.close();
        System.out.println("o valor do carro " + carros[escolha - 1] + " é igual " + formatador.format(valor[escolha -1]));
        System.out.println("o valor do desconto a ser aplicado é " + formatador.format(valorDesconto));
        System.out.println("o valor do carro com o desconto é: " + formatador.format(ValorCarroComDesconto));
        
	}

}
