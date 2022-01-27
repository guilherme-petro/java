package br.com.generation.repeticao.exerciciosextras;

	/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99. (WHILE)*/

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int idade = 0, menos = 0, mais = 0;
		
		while (idade != -99) {
			
			System.out.println("Insira a idade: ");
			idade = in.nextInt();
			
			if (idade < 0 || idade > 122) { // usei 122 como valor máximo por ser o maior tempo que uma pessoa viveu na história, pelo que pesquisei.
				System.out.println("Valor inválido. Insira um número entre 0 e 122 anos, ou -99 para finalizar.");
			}
			else if (idade < 21) {
				menos++;
			}
			else if (idade > 50) {
				mais++;
			}
		}
		
		System.out.println("\nNúmero de pessoas com menos de 21 anos: " + menos);
		System.out.println("Número de pessoas com mais de 50 anos: " + mais);
		
		in.close();

	}

}
