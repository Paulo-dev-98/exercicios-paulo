package br.com.logica;

public class ArrayExemplo {
	
	public static void main(String[] args) {
		//preenchendo array primeira forma.
		int[] numero = new int[5];	
		// posição 0, elemento 1
		numero[0] = 0;
		// posição 1, elemento 2
		numero[1] = 1;
		// posição 2, elemento 3
		numero[2] = 2;
		// posição 3, elemento 4
		numero[3] = 3;
		// posição 4, elemento 5
		numero[4] = 4;
		
		// preenchendo array segunda forma.
		int[] valores = {10,20,30,40,50};
		
		// acessando a terceira posição do array (que é o numero 2, lembrando que o array se inicia com 0)
		System.out.println("======================================");
		System.out.println("acessando o terceiro elemento que é: " + numero[2]);
		System.out.println("======================================");
		
		// alterando os valores da posição do array
		numero[3] = 6;
		numero[4] = 8;
		
		// Acessando elementos alterados
		System.out.println("posição 3 alterada para: " + numero[3]);
		System.out.println("posição 4 alterada para: " + numero[4]);
		System.out.println("======================================");
		
		// mostrando todos os elementos array com um for
		for(int elementos: numero) {
			System.out.println("-----------");
			System.out.println("posição: " + elementos);
		}
		
		// mostrando todos os elementos array com um for de um outro jeito
		for(int i = 0; i < valores.length ;  i++) {
			System.out.println("-----------");
			System.out.println("elemento: " + valores[i]);
		}
		
		// soma dos arrays
		double total = 0;
		for(int i = 0; i < valores.length; i++) {
			total += valores[i];
		}
		System.out.println("--------------------------");
		System.out.println("a soma dos arrays é: " + total);
		System.out.println("--------------------------");
	}

}
