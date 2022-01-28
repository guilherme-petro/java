package br.com.generation.exerciciosvetoresmatrizes;

	/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.*/

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Random lance = new Random();
		
		int[] dado = new int[10];
		double soma = 0.0, media = 0.0;
		int maior = 0, ocorr = 0;
		
		for (int cont = 0; cont < dado.length; cont++) {
			dado[cont] = lance.nextInt(6)+1;
			soma += dado[cont];
			media = soma / (cont + 1);
			System.out.print (dado[cont] + " | ");
			
			if (dado[cont] > maior) {
				maior = dado[cont];
				ocorr = 1;
			}
			else if (dado[cont] == maior) {
				ocorr++;
			}
		}
		
		System.out.println("\nMédia: " + media);
		System.out.println("Número de ocorrências da maior pontuação: " + ocorr);

	}

}
