package br.com.generation.exercicios;

	/*2) Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/

public class Ex02Aviao {

	private String marca;
	private String modelo;
	private int anoFabricacao;
	private int velocidade;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	void acelerar(int aceleracao) {
		this.velocidade += aceleracao;
	}
	
	void frear(int aceleracao) {
		this.velocidade -= aceleracao;
	}
	
	void decolar() {
		System.out.println("Delocando...");
	}
	
	void pousar() {
		System.out.println("Pousando...");
	}
	
}
