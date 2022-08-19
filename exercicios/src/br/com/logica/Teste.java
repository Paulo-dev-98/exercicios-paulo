package br.com.logica;
import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] numeros = {"Um","dois", "três", "quatro", "cinco"};
	    int numero = teclado.nextInt();
	    if(numero > 0 && numero <= 5) {
	    	System.out.println(numeros[numero -1]);
	    }else{
	    	System.out.println("Numero Invalido");
	    }
	    teclado.close();
	}
}