package br.com.generation.repeticao.exerciciosextras;

	//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n[], pares = 0, impares = 0;
		n = new int[10];
		
		for (int cont = 0; cont < 10; cont++) {
			System.out.println("Insira o número: ");
			n[cont] = in.nextInt();
			
			if (n[cont] % 2 == 0) {
				pares++;
			}
			else {
				impares++;
			}
		}
		
		System.out.println("Números pares inseridos: " + pares);
		System.out.println("Números ímpares inseridos: " + impares);
		
		in.close();
		
	}

}
