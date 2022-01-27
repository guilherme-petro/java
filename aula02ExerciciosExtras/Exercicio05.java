package br.com.generation.repeticao.exerciciosextras;

	/*5- Crie um programa que leia um número do teclado até que encontre um
	número igual a zero. No final, mostre a soma dos números
	digitados.(DO...WHILE)*/

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = 0, soma = 0;
		
		do {
			soma += n;
			System.out.println("Digite um número: ");
			n = in.nextInt();
		}
		while (n != 0);
		
		System.out.println("A soma dos números é: " + soma);
		
		in.close();

	}

}
