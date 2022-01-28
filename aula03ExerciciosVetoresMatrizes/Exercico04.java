package br.com.generation.exerciciosvetoresmatrizes;

	/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.*/

import java.util.Scanner;

public class Exercico04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int soma = 0, somaDiagonal = 0;
		
		for(int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				
				System.out.printf("Insira o valor de [%d][%d]: ", l, c);
				matriz[l][c] = in.nextInt();
				soma += matriz[l][c];
				
				if (l == c) {
					somaDiagonal += matriz[l][c];
				}
				
			}
		}
		
		System.out.println();
		
		for(int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print(matriz[l][c] + " | ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Soma: " + soma);
		System.out.println("Soma diagonal: " + somaDiagonal);
		
		in.close();

	}

}
