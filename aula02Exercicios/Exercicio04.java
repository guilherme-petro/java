package br.com.generation.repeticao.exercicios;

	/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	ímpar exiba o número elevado ao quadrado.*/

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n;
		double raiz, potencia;
		
		System.out.println("Insira um número: ");
		n = in.nextInt();
		
		if (n % 2 == 0) {
			raiz = Math.sqrt(n);
			System.out.println("Este númro é par. Sua raiz quadrada é: " + raiz);
		}
		else {
			potencia = Math.pow(n, 2);
			System.out.println("Este número é ímpar. Seu valor elevado ao quadrado é: " + potencia);
		}
		
		in.close();
		
	}

}
