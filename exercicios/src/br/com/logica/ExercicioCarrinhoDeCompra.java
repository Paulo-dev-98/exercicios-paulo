package br.com.logica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCarrinhoDeCompra {
	public static void main(String[] args) {
		int estoque = 0;
		float desconto = 0;
		float totalPagar = 0;
		String carrinho = "";
		String[] pagamento = { "\n1 - A vista em dinheiro, pix ou cartão com 20% de desconto "
				+ "\n2 - A vista no crédito com 10% de desconto \n3 - em três vezes no cartão sem descontos" };
		int opcao = 0;
		int escolha = 0;
		DecimalFormat formatador = new DecimalFormat("#,##0.00");
		Scanner teclado = new Scanner(System.in);
		float valor = 0;
		String[] produtos = { " CD do Metallica", " CD do Iron Maiden", " CD do Epica", " CD do Evanescence",
				" CD do Nightwish" };
		float[] preco = { 19.90f, 25.90f, 32.90f, 40.90f, 35.90f };

		do {
			System.out.println("1 - Comprar \n2 - Ver Carrinho \n3 - Selecionar Pagamento");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("------------------");
				System.out.println("Escolha um produto");
				System.out.println("------------------");
				for (int i = 0; i < produtos.length; i++) {
					System.out.println((i + 1) + " - " + produtos[i]);
				}
				if (estoque <= 5) {
					escolha = teclado.nextInt();
					valor += preco[escolha - 1];
					carrinho += produtos[escolha - 1];
					System.out.println("-------------");
					System.out.println("valor:" + formatador.format(valor));
					System.out.println("-------------");
					estoque++;
				} else {
					System.out.println("--------------------------------------");
					System.out.println("Lamento mas esse produto esta em falta");
					System.out.println("--------------------------------------");
				}
				break;
			case 2:
				System.out.println("--------------------------------------------");
				System.out.println("Os produtos no carrinho são:" + carrinho);
				System.out.println("--------------------------------------------");
				System.out.println("O valor total é: " + formatador.format(valor));
				break;
			case 3:
				System.out.println("--------------------------");
				System.out.println("Escolha a forma de pagar: ");
				System.out.println("--------------------------");
				for (int i = 0; i < pagamento.length; i++) {
					System.out.println((i + 1) + " - " + pagamento[i]);
				}
				escolha = teclado.nextInt();
				if (escolha == 1) {
					desconto = valor * 0.20f;
					totalPagar = valor - desconto;
					System.out.println("-------------------------------------");
					System.out.println("Você escolheu a opção 1 e o valor é: " + formatador.format(valor));
					System.out.println("-------------------------------------");
					System.out.println("O valor do desconto é: " + formatador.format(desconto));
					System.out.println("-------------------------------------");
					System.out.println("O valor total a se pagar é: " + formatador.format(totalPagar));
				} else if (escolha == 2) {
					desconto = valor * 0.10f;
					totalPagar = valor - desconto;
					System.out.println("-------------------------------------");
					System.out.println("Você escolheu a opção 2 e o valor é: " + formatador.format(valor));
					System.out.println("-------------------------------------");
					System.out.println("O valor do desconto é: " + formatador.format(desconto));
					System.out.println("-------------------------------------");
					System.out.println("O valor total a se pagar é: " + formatador.format(totalPagar));
				} else if (escolha == 3) {
					totalPagar = valor / 3;
					System.out.println("-----------------------------------------------");
					System.out.println("Você escolheu a opção 3 e ela não tem descontos");
					System.out.println("-----------------------------------------------");
					System.out.println("O valor total é: " + formatador.format(valor));
					System.out.println("-----------------------------------------------");
					System.out.println("Sendo cada parcela no valor de: " + formatador.format(totalPagar));
				}
				System.out.println("--------------------------------------");
				System.out.println("Adeus, foi um prazer negociar com você");
				System.out.println("--------------------------------------");
				break;
			default:
				System.out.println("----");
				System.out.println("erro");
				System.out.println("----");
			}
		} while (opcao != 3);
		teclado.close();
	}
}