package br.com.generation.aula01Exercicios;

/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalDias, divisor, anos, meses, dias;
		
		Scanner leia = new Scanner(System.in);

		System.out.print("Insira sua idade em dias: ");
		totalDias = leia.nextInt();
		
		divisor = totalDias % 365;
		anos = (totalDias - divisor) / 365;
		meses = divisor / 30;
		dias = divisor % 30;

		System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias.");
		
		leia.close();

	}

}
