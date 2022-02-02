package br.com.generation.exerciciosheranca;

public class Ex01Preguica extends Ex01Animal implements Ex01AnimalComandos {

	public void emitirSom() {
		System.out.println("Som de preguiça");
	}
	
	public void acao() {
		System.out.println("Preguiça subindo em árvores.");
	}
	
}
