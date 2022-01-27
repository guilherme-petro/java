package br.com.generation.repeticao.exerciciosextras;

	/*6- Escrever um programa que receba vários números inteiros no teclado. E no
	final imprimir a média dos números múltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE)*/

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = 0;
		double soma = 0, cont = 0;
		
		do {
			
			System.out.println("Digite um número: ");
			n = in.nextInt();
			
			if (n % 3 == 0 & n != 0) { // aqui tem um diferente de zero porque quando digitamos 0 para encerrar, +
				soma += n; 			  //  + ele ainda considera o if verdadeiro e adiciona mais 1 no contador
				cont++;
			}
			
		}
		while (n != 0);
		
		System.out.println("A média dos múltiplos de 3 digitados é: " + (soma/cont));
		
		in.close();

	}

}
