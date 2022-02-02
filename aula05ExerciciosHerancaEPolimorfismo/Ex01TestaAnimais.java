package br.com.generation.exerciciosheranca;

import java.util.Scanner;

public class Ex01TestaAnimais {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		Ex01AcaoAnimal ac = new Ex01AcaoAnimal();
		
		Ex01Cachorro cachorro1 = new Ex01Cachorro();
		Ex01Cavalo cavalo1 = new Ex01Cavalo();
		Ex01Preguica preguica1 = new Ex01Preguica();
		
		//entrada de informações do cachorro
		System.out.print("Digite o nome do cachorro: ");
		cachorro1.setNome(in.next());
		System.out.print("Digite a idade do cachorro: ");
		cachorro1.setIdade(in.nextInt());
		System.out.println();
		
		//entrada de informações do cavalo
		System.out.print("Digite o nome do cavalo: ");
		cavalo1.setNome(in.next());
		System.out.print("Digite a idade do cavalo: ");
		cavalo1.setIdade(in.nextInt());
		System.out.println();
		
		//entrada de informações da preguica
		System.out.print("Digite o nome da preguiça: ");
		preguica1.setNome(in.next());
		System.out.print("Digite a idade da preguiça: ");
		preguica1.setIdade(in.nextInt());
		System.out.println();
		
		//saída cachorro
		System.out.println("Nome: " + cachorro1.getNome());
		System.out.println("Idade: " + cachorro1.getIdade());
		ac.fazerAnimalEmitirSom(new Ex01Cachorro());
		ac.fazerAnimalMover(new Ex01Cachorro());
		
		System.out.println();
		
		// saida cavalo
		System.out.println("Nome: " + cavalo1.getNome());
		System.out.println("Idade: " + cavalo1.getIdade());
		ac.fazerAnimalEmitirSom(new Ex01Cavalo());
		ac.fazerAnimalMover(new Ex01Cavalo());
		
		System.out.println();
		
		//saida preguiça
		System.out.println("Nome: " + preguica1.getNome());
		System.out.println("Idade: " + preguica1.getIdade());
		ac.fazerAnimalEmitirSom(new Ex01Preguica());
		ac.fazerAnimalMover(new Ex01Preguica());
		
		in.close();
	}

}
