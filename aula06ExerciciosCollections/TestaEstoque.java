package br.com.generation.exerciciocollection;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		ArrayList<Estoque> estoque1 = new ArrayList<>();
		
		System.out.print("Digite a quantidade de produtos: ");
		int numeroProdutos = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i < numeroProdutos; i++) {
			System.out.print("Produto: ");
			String produto = in.next();
			in.nextLine();
			
			System.out.print("Quantidade: ");
			int qtde = in.nextInt();
			in.nextLine();
			
			System.out.print("Preço: ");
			double preco = in.nextDouble();
			in.nextLine();
			
			estoque1.add(new Estoque(produto, qtde, preco));
		}
		
		for(Estoque i: estoque1) {
			System.out.print(i);
		}
		
		System.out.println();
		
		estoque1.remove(2);
		
		for(Estoque i: estoque1) {
			System.out.print(i);
		}
		
		in.close();

	}

}
