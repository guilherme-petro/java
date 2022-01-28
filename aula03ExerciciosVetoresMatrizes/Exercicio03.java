package br.com.generation.exerciciosvetoresmatrizes;

	/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
	das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
	posição das matrizes N1 e N2.*/

import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];
		
		for (int l = 0; l < n1.length; l++ ) {
			for (int c = 0; c < n1[l].length; c++ ) {
				n1[l][c] = random.nextInt(10);
				n2[l][c] = random.nextInt(10);
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
		
		System.out.println("\nN1");
		
		for (int l = 0; l < n1.length; l++ ) {
			for (int c = 0; c < n1[l].length; c++ ) {
				System.out.print(n1[l][c] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("\nN2");
		
		for (int l = 0; l < n1.length; l++ ) {
			for (int c = 0; c < n2[l].length; c++ ) {
				System.out.print(n2[l][c] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("\nM1");
		
		for (int l = 0; l < n1.length; l++ ) {
			for (int c = 0; c < m1[l].length; c++ ) {
				System.out.print(m1[l][c] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("\nM2");
		
		for (int l = 0; l < n1.length; l++ ) {
			for (int c = 0; c < m2[l].length; c++ ) {
				System.out.print(m2[l][c] + " | ");
			}
			System.out.println();
		}

	}

}
