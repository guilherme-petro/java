package br.com.generation.aula01Exercicios;

/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalSegundos, divisorSegundos, horas, segundos, minutos;
		
		Scanner leia = new Scanner (System.in);

		System.out.print("Duração em segundos: ");
		totalSegundos = leia.nextInt();

		divisorSegundos = totalSegundos % 3600;
		horas = (totalSegundos - divisorSegundos) / 3600;
		minutos = divisorSegundos / 60;
		segundos = divisorSegundos % 60;

		System.out.println("Total: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
		
		leia.close();

	}

}
