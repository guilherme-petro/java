package br.com.generation.repeticao.exercicios;

	//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a, b, c, maior, meio, menor;
		
		System.out.println("Insira o primeiro n�mero: ");
		a = in.nextInt();
		
		System.out.println("Insira o segundo n�mero: ");
		b = in.nextInt();
		
		if (b > a) {
			maior = b;
			meio = a;
		}
		else {
			maior = a;
			meio = b;
		}
		
		System.out.println("Insira o terceiro n�mero: ");
		c = in.nextInt();
		
		if (c >= maior) {
			menor = meio;
			meio = maior;
			maior = c;
		}
		else if (c >= meio) {
			menor = meio;
			meio = c;
		}
		else {
			menor = c;
		}
		
		
		
		System.out.println("Os n�meros digitados foram: " + menor + ", " + meio + " e " + maior + ".");
		
		in.close();

	}

}
