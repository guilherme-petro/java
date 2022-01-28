package br.com.generation.exerciciosvetoresmatrizes;

	/*1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
	atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double[] n = new double[5];
		double maior = 0.0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o valor: ");
			n[i] = in.nextDouble();
			
			if (n[i] > maior) {
				maior = n[i];
			}
			
		}
		
		System.out.println("\nN�MEOS DIGITADOS: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(n[i]);
		}
		
		System.out.println("O maior valor digitado foi: " + maior);
		
		in.close();

	}

}
