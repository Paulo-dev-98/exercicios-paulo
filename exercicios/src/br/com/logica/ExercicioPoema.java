package br.com.logica;

import java.util.Random;

import javax.swing.JOptionPane;

public class ExercicioPoema {

	public static void main(String[] args) {

		System.out.println("===================================Bem Vindo======================================");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("==============================Vamos jogar um jogo=================================");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("=====Se você ganhar vai poder ver um dos cinco poemas que selecionei pra você=====");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("===================quero que você me diga um numero de dois digitos===============");
		System.out.println("----------------------------------------------------------------------------------");

		int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
		Random aleatorio = new Random();
		int numeroGerado = aleatorio.nextInt(50);

		while (numero != numeroGerado) {
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("lamento mas esse não é o numero");
			System.out.println("------------------------------------------------------------------------------");
			if (numero > numeroGerado) {
				System.out.println("o numero digitado é maior");
			} else {
				System.out.println("o numero digitado é menor");
			}
			numero = Integer.parseInt(JOptionPane.showInputDialog(""));
		}

		int numeroPoema = aleatorio.nextInt(5);

		System.out.println("=============================================================");
		System.out.println("parabéns esse é o numero");
		System.out.println("=============================================================");

		switch (numeroPoema) {
		case 1:
			System.out.println("Cada batida do seu coração quebrou a mentira em pedaços \n"
					+ "fazendo as fundações tremerem, cada onda no lago fez a porcelana quebrar \n"
					+ "e eu me extilhaço (Epica - fient)");
			break;

		case 2:
			System.out.println("Uma vez eu soube todos os contos, é hora de voltar no tempo, seguir o luar palido \n"
					+ "uma vez anciei por está noite, a fé me trouxe aqui, é hora de cortar a corda e voar. \n"
					+ "(Nightwish - Dark Chest of Wonders)");
			break;
		case 3:
			System.out.println("Eu fico sozinho na tempestade, repentinamente doces palavras tomam forma \n"
					+ "rapidamente elas dizem: você não tem muito tempo, abra seus olhos para o amor a sua volta \n"
					+ "você pode sentir que está só mas eu estou aqui por você \n"
					+ "você pode fazer tudo que sonha, somente lembre de ouvir a chuva (Evanescence - Liste to the Rain)");
			break;
		case 4:
			System.out.println("Cada segundo do dia esta vindo em sua direção, Futuro desconhecido está aqui para ficar \n"
							+ "você tem que abrir a mente ou acabará desviando, Há um tempo para viver, Há um tempo para morrer \n"
							+ "mas ninguém pode escapar do destino (Stratovarius - destiny)");
			break;

		default:
			System.out.println("No meu sonho eu estava em um vale com águas claras como gelo, Árvores e montanhas me rodiavam \n"
							+ "Nada era tão bonito como aquilo que eu vi, Pode um lugar como este ainda existir? \n"
							+ "Um lugar onde as pessoas ainda não destruiram, não há poluição apenas ar fresco \n"
							+ "Um lugar onde todos os homens ajudam a cuidar, Esté é o paraíso que eu gostaria de permanecer \n"
							+ "quando ninguém mais pode encontrar um caminho (Dreamtale - Where the Rainbow Ends) ");
			break;
		}

	}

}
