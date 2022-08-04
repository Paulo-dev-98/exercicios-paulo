package br.com.logica;

import javax.swing.JOptionPane;

public class ExercicioWhile {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("digite seu nome");
		
		while(!nome.equalsIgnoreCase("s")) {
			 System.out.println("================================");
			 System.out.println("welcome to the jungle " + nome);
			 System.out.println("================================");
			 System.out.println("digite outro nome ou s para sair");
			 System.out.println("================================");
			 nome = JOptionPane.showInputDialog("");
		}
		System.out.println("===============");
		System.out.println("fim do programa");
		System.out.println("===============");
	}

}
