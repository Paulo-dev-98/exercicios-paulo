package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		int distanciaTotal = Integer.parseInt(JOptionPane.showInputDialog("digite a distancia total"));
		int combustivelGasto  = Integer.parseInt(JOptionPane.showInputDialog("digite o combustivel gasto"));

		int consumoMedio = distanciaTotal / combustivelGasto;
		
		System.out.println(consumoMedio);
		
	}
}
