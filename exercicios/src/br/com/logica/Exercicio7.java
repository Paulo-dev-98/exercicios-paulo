package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio7 {
	
	public static void main(String[] args) {
		double temperaturaEmGrauCelsius = Double.parseDouble(JOptionPane.showInputDialog("digite a temperatura em celsius")); 
		double TemperaturaEmfahreheit = (9 * temperaturaEmGrauCelsius + 160) /5;
		
		System.out.println("esta temperatura em fahrehit é: " + TemperaturaEmfahreheit);
	}

}
