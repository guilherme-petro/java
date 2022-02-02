package br.com.generation.exerciciosheranca;

public class Ex01Cavalo extends Ex01Animal implements Ex01AnimalComandos {

		public void emitirSom() {
			System.out.println("Relinchando...");
		}
		
		public void acao() {
			System.out.println("Cavalo correndo.");
		}
	
}
