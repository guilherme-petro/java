package br.com.generation.aula01Exercicios;

	/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
	consumidor.*/

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double custoFabrica, distribuidor, imposto, custoTotal;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Insira o valor de fábrica: ");
		custoFabrica = leia.nextDouble();

		distribuidor = custoFabrica * 0.28;
		imposto = custoFabrica * 0.45;
		custoTotal = custoFabrica + distribuidor + imposto;

		System.out.println("O custo ao consumidor é de R$" + custoTotal);
		
		leia.close();

	}

}
