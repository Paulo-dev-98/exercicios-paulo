package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		int distanciaTotal = Integer.parseInt(JOptionPane.showInputDialog("digite a distancia total"));
		int combustivelGasto  = Integer.parseInt(JOptionPane.showInputDialog("digite o combustivel gasto"));

		int consumoMedio = distanciaTotal / combustivelGasto;
		System.out.println("---------------------------------------------------");
		System.out.println("A distancia total �: " + distanciaTotal + "km");
		System.out.println("---------------------------------------------------");
		System.out.println("O combustivel gasto �: " + combustivelGasto + " litros");
		System.out.println("---------------------------------------------------");
		System.out.println("O consumo medio de combustivel �: " + consumoMedio + " litros");
		System.out.println("---------------------------------------------------");
		
	}
}
