package br.com.generation.repeticao.exercicios;

		//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n1, n2, n3, maior;
		
		System.out.println("Insira o primeiro n�mero: ");
		n1 = in.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		n2 = in.nextInt();
		
		if (n1 > n2) {
			maior = n1;
		}
		else {
			maior = n2;
		}
		
		System.out.println("Insira o terceiro n�mero: ");
		n3 = in.nextInt();
		
		if (n3 > maior) {
			maior = n3;
		}
		
		System.out.println("O maior n�mero digitado foi " + maior + ".");
		
		in.close();

	}

}
