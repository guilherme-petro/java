package br.com.generation.exerciciosheranca;

public class Ex01Preguica extends Ex01Animal implements Ex01AnimalComandos {

	public void emitirSom() {
		System.out.println("Som de pregui�a");
	}
	
	public void acao() {
		System.out.println("Pregui�a subindo em �rvores.");
	}
	
}
