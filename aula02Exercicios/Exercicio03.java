package br.com.generation.repeticao.exercicios;

	/*3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
	categoria ela se encontra:
	 10-14 infantil
	 15-17 juvenil
	 18-25 adulto*/

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int i = 1;
		
		System.out.println("Insira a idade: ");
		i = entrada.nextInt();
		
		
		if (i >= 10 & i <= 14) {
			System.out.println("Voc� est� na categoria INFANTIL.");
		}
		else if (i >= 15 & i <= 17) {
			System.out.println("Voc� est� na categoria JUVENIL.");
		}
		else if (i >= 18 & i <= 25) {
			System.out.println("Voc� est� na categoria ADULTA.");
		}
		else {
			System.out.println("Categoria inv�lida! Digite uma idade entre 10 e 25 anos.");
		}
		
		entrada.close();

	}

}
