package br.com.generation.aula01Exercicios;
		
		import java.util.Scanner;

		public class Exercicio07 {
			
			public static void main(String[] args) {
				
				double a, b, c, d, e, f, x, y;
				
				Scanner leia = new Scanner(System.in);
				
				System.out.print("A: ");
				a = leia.nextDouble();
				System.out.print("B: ");
				b = leia.nextDouble();
				System.out.print("C: ");
				c = leia.nextDouble();
				System.out.print("D: ");
				d = leia.nextDouble();
				System.out.print("E: ");
				e = leia.nextDouble();
				System.out.print("F: ");
				f = leia.nextDouble();
				
				x = ((c*e)-(c*f))/((a*e)-(b*d));
				y = ((a*f)-(c*d))/((a*e)-(b*d));

				System.out.println("O valor de X é: " + x);
				System.out.println("O valor de Y é: " + y);
				
				leia.close();

				//esse não entendi muito bem por não lembrar do tema, apenas tentei reproduzir as instruções do enunciado.

	}

}
