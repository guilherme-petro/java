package br.com.generation.aula01Exercicios;

	/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
	consumidor.*/

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double custoFabrica, distribuidor, imposto, custoTotal;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Insira o valor de f�brica: ");
		custoFabrica = leia.nextDouble();

		distribuidor = custoFabrica * 0.28;
		imposto = custoFabrica * 0.45;
		custoTotal = custoFabrica + distribuidor + imposto;

		System.out.println("O custo ao consumidor � de R$" + custoTotal);
		
		leia.close();

	}

}
