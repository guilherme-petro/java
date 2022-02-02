package br.com.generation.exerciciocollection;

	/*3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
	trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
	programa deverá atender as seguintes funcionalidades:
	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.*/

public class Estoque {
	
	// Atributos
	private String produto;
	private int qtde;
	private double preco;
	
	// Construtor
	public Estoque(String produto, int qtde, double preco) {
		super();
		this.produto = produto;
		this.qtde = qtde;
		this.preco = preco;
	}
	
	// Getters and Setters
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return "\nProduto: " + this.produto + " | Quantidade: " + this.qtde + " | Preço: R$" + this.preco;
	}
	
}
