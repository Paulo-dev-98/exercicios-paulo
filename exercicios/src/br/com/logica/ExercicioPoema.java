package br.com.logica;

import java.util.Random;

import javax.swing.JOptionPane;

public class ExercicioPoema {

	public static void main(String[] args) {

		System.out.println("===================================Bem Vindo======================================");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("==============================Vamos jogar um jogo=================================");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("===============Se voc� ganhar vai poder ver um dos cinco poemas que selecionei pra voc�=================");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("===================quero que voc� me diga um numero de dois digitos================");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("===================Dica do primeiro digito: sou o sucessor do primordio e dou sentido ao nada================");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("===================Dica do segundo digito: Em pe s� posso ver o que est� a frente mas se me deito posso ver as estrelas================");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("============================Boa Sorte! As tentativas s�o ilimitadas================");
		System.out.println("----------------------------------------------------------------------------------");
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
		Random aleatorio = new Random();

		while (numero != 18) {
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("lamento mas esse n�o � o numero");
			System.out.println("----------------------------------------------------------------------------------");
			numero = Integer.parseInt(JOptionPane.showInputDialog(""));
		}

		int x = aleatorio.nextInt(5);

		if (x == 1) {
			System.out.println("=============================================================");
			System.out.println("parab�ns esse � o numero");
			System.out.println("=============================================================");
			System.out.println("Cada batida do seu cora��o quebrou a mentira em peda�os \n"
					+ "fazendo as funda��es tremerem, cada onda no lago fez a porcelana quebrar \n"
					+ "e eu me extilha�o (Epica - fient)");
		} else if (x == 2) {
			System.out.println("=============================================================");
			System.out.println("parab�ns esse � o numero");
			System.out.println("=============================================================");
			System.out.println("Uma vez eu soube todos os contos, � hora de voltar no tempo, seguir o luar palido \n"
					+ "uma vez anciei por est� noite, a f� me trouxe aqui, � hora de cortar a corda e voar. \n"
					+ "(Nightwish - Dark Chest of Wonders)");
		} else if (x == 3) {
			System.out.println("=============================================================");
			System.out.println("parab�ns esse � o numero");
			System.out.println("=============================================================");
			System.out.println("Eu fico sozinho na tempestade, repentinamente doces palavras tomam forma \n"
					+ "rapidamente elas dizem: voc� n�o tem muito tempo, abra seus olhos para o amor a sua volta \n"
					+ "voc� pode sentir que est� s� mas eu estou aqui por voc� \n"
					+ "voc� pode fazer tudo que sonha, somente lembre de ouvir a chuva (Evanescence - Liste to the Rain)");
		} else if (x == 4) {
			System.out.println("=============================================================");
			System.out.println("parab�ns esse � o numero");
			System.out.println("=============================================================");
			System.out.println(
					"Cada segundo do dia esta vindo em sua dire��o, Futuro desconhecido est� aqui para ficar \n"
							+ "voc� tem que abrir a mente ou acabar� desviando, H� um tempo para viver, H� um tempo para morrer \n"
							+ "mas ningu�m pode escapar do destino (Stratovarius - destiny)");
		} else if (x == 5) {
			System.out.println("=============================================================");
			System.out.println("parab�ns esse � o numero");
			System.out.println("=============================================================");
			System.out.println(
					"No meu sonho eu estava em um vale com �guas claras como gelo, �rvores e montanhas me rodiavam \n"
							+ "Nada era t�o bonito como aquilo que eu vi, Pode um lugar como este ainda existir? \n"
							+ "Um lugar onde as pessoas ainda n�o destruiram, n�o h� polui��o apenas ar fresco \n"
							+ "Um lugar onde todos os homens ajudam a cuidar, Est� � o para�so que eu gostaria de permanecer \n"
							+ "quando ningu�m mais pode encontrar um caminho (Dreamtale - Where the Rainbow Ends) ");
		}

	}

}
