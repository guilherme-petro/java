package br.com.generation.repeticao.exercicios;

		//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n1, n2, n3, maior;
		
		System.out.println("Insira o primeiro número: ");
		n1 = in.nextInt();
		System.out.println("Insira o segundo número: ");
		n2 = in.nextInt();
		
		if (n1 > n2) {
			maior = n1;
		}
		else {
			maior = n2;
		}
		
		System.out.println("Insira o terceiro número: ");
		n3 = in.nextInt();
		
		if (n3 > maior) {
			maior = n3;
		}
		
		System.out.println("O maior número digitado foi " + maior + ".");
		
		in.close();

	}

}
