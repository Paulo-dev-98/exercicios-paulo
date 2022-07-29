package br.com.logica;

import javax.swing.JOptionPane;

public class ExercicioWhile {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("digite seu nome");
		
		while(!nome.equalsIgnoreCase("s")) {
			 System.out.println("welcome to the jungle \n" + nome);
			 System.out.println("digite outro nome ou s para sair");
			 nome = JOptionPane.showInputDialog("");
		}
		System.out.println("fim do programa");
	}

}
