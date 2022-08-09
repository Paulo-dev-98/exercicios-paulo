package br.com.logica;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioInversaoArray {

	public static void main(String[] args) {
		

        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[3];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("----------------");
            System.out.println("digite um numero");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("======================= Crescente =============================");
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("====================== Decrescente ===========================");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * -1;
        }
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * -1;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        teclado.close();
    }

}
