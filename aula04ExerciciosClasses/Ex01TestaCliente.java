package br.com.generation.exercicios;

	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/

public class Ex01TestaCliente {

	public static void main(String[] args) {

		Ex01Cliente cl1 = new Ex01Cliente();
		
		cl1.setNome("Marcos");
		cl1.setIdade(20);
		cl1.setEndereco("Rua Paineira, 25");
		
		System.out.println("Nome: " + cl1.getNome());
		System.out.println("Idade: " + cl1.getIdade());
		System.out.println("Encederço: " + cl1.getEndereco());
		
		cl1.comprar();
		
	}

}
