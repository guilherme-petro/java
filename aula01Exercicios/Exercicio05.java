package br.com.generation.aula01Exercicios;

/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1, n2, n3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		n1 = leia.nextDouble();
		System.out.print("Nota 2: ");
		n2 = leia.nextDouble();
		System.out.print("Nota 3: ");
		n3 = leia.nextDouble();
		
		media = ((n1*2) + (n2*3) + (n3*5)) / 10;
		
		System.out.println("M�dia: " + media);
		
		leia.close();
		
		

	}

}
