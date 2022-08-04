package br.com.logica;

import javax.swing.JOptionPane;

public class Exercicio9 {
	public static void main(String[] args) {
       double valorDepositado = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do deposito"));
       int numeroDeMeses  = Integer.parseInt(JOptionPane.showInputDialog("digite o numero de meses"));
       double rendimento = numeroDeMeses * 0.07;
       double valorDoRendimento = valorDepositado * rendimento;
       double ValorComRendimento = valorDepositado + valorDoRendimento;
       
       System.out.println("==============================================================");
       System.out.println("O valor depositado é: " + valorDepositado);
       System.out.println("==============================================================");
       System.out.println("O numero de meses em rendimento é: " + numeroDeMeses);
       System.out.println("==============================================================");
       System.out.println("O rendimento de acordo com o numero de meses é:  " + rendimento);
       System.out.println("==============================================================");
       System.out.println("O valor do redimento se torna: " + valorDoRendimento);
       System.out.println("==============================================================");
       System.out.println("O valor total com o redimento se torna: " + ValorComRendimento);
       System.out.println("==============================================================");
       
	}
}
