package br.com.generation.aula01Exercicios;

/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão*/

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c, r, s, d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("A: ");
		a = leia.nextDouble();
		System.out.print("B: ");
		b = leia.nextDouble();
		System.out.print("C: ");
		c = leia.nextDouble();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;
		
		System.out.println();
		System.out.println("R: " + r);
		System.out.println("S: " + s);
		System.out.println("D: " + d);
		
		leia.close();

	}

}
