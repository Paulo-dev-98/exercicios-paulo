package br.com.logica;

import java.awt.Desktop;
import java.net.URI;

import javax.swing.JOptionPane;

public class ExercicioArrayBanda {

	public static void main(String[] args) {

		String[] bandas = new String[] { "Evanescence", "Nightwish", "Epica", "Nightmare", "Stratovarius", "Hyubris",
				"Metallica", "Iron Maiden", "sair" };

		int opcaoEscolhida = 0;

		while (opcaoEscolhida != 8) {
			opcaoEscolhida = JOptionPane.showOptionDialog(null, "O que você deseja ouvir?", "Recanto Dev Metal",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bandas, 0);

			System.out.println("--------------");
			System.out.println("você escolheu: ");

			if (opcaoEscolhida <= 7) {

				switch (opcaoEscolhida) {
				case 0:
					System.out.println("-----------");
					System.out.println("Evanescence");
					try {
						URI link = new URI("https://www.youtube.com/watch?v=ylEfbvLY1nU");
						Desktop.getDesktop().browse(link);
					} catch (Exception e) {
						JOptionPane.showInputDialog("erro", e);
					}
					break;

				case 1:
					System.out.println("---------");
					System.out.println("Nightwish");
					try {
						URI link = new URI("https://www.youtube.com/watch?v=5SuwJSfX8pI");
						Desktop.getDesktop().browse(link);
					} catch (Exception e) {
						JOptionPane.showInputDialog("erro", e);
					}
					break;

				case 2:
					System.out.println("-----");
					System.out.println("Epica");
					try {
						URI link = new URI("https://www.youtube.com/watch?v=wED_8DmFjPw");
						Desktop.getDesktop().browse(link);
					} catch (Exception e) {
						JOptionPane.showInputDialog("erro", e);
					}
					break;

				case 3:
					System.out.println("---------");
					System.out.println("Nightmare");
					try {
						URI link = new URI("https://www.youtube.com/watch?v=bPUzw_NajW0");
						Desktop.getDesktop().browse(link);
					} catch (Exception e) {
						JOptionPane.showInputDialog("erro", e);
					}
					break;

				case 4:
					System.out.println("------------");
					System.out.println("Stratovarios");
					try {
						URI link = new URI("https://www.youtube.com/watch?v=rec-qJISgsA");
						Desktop.getDesktop().browse(link);
					} catch (Exception e) {
						JOptionPane.showInputDialog("erro", e);
					}
					break;

				case 5:
					System.out.println("-------");
					System.out.println("Hyubris");
					try {
						URI link = new URI("https://www.youtube.com/watch?v=CyHtyBQ-rlE");
						Desktop.getDesktop().browse(link);
					} catch (Exception e) {
						JOptionPane.showInputDialog("erro", e);
					}
					break;

				case 6:
					System.out.println("---------");
					System.out.println("Metallica");
					try {
						URI link = new URI("https://www.youtube.com/watch?v=d00KwyFDdYs");
						Desktop.getDesktop().browse(link);
					} catch (Exception e) {
						JOptionPane.showInputDialog("erro", e);
					}
					break;

				case 7:
					System.out.println("-----------");
					System.out.println("Iron Maiden");
					try {
						URI link = new URI("https://www.youtube.com/watch?v=msvLyCsdEoY");
						Desktop.getDesktop().browse(link);
					} catch (Exception e) {
						JOptionPane.showInputDialog("erro", e);
					}
					break;
				}
			} else {
				System.out.println("----------------------------------------------");
				System.out.println("sair \nAte Logo, Foi Um prazer curtir rock com você!");
			}
		}
	}
}