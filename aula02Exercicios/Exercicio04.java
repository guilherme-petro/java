package br.com.generation.repeticao.exercicios;

	/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	�mpar exiba o n�mero elevado ao quadrado.*/

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n;
		double raiz, potencia;
		
		System.out.println("Insira um n�mero: ");
		n = in.nextInt();
		
		if (n % 2 == 0) {
			raiz = Math.sqrt(n);
			System.out.println("Este n�mro � par. Sua raiz quadrada �: " + raiz);
		}
		else {
			potencia = Math.pow(n, 2);
			System.out.println("Este n�mero � �mpar. Seu valor elevado ao quadrado �: " + potencia);
		}
		
		in.close();
		
	}

}
