package br.com.generation.aula01Exercicios;

/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

import java.util.Scanner;
//import java.util.Calendar;
//import java.util.Date;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ano, mes, dia, totalAnos, totalMeses, totalDias, resultado;
		
		Scanner leia = new Scanner(System.in);
		//Date data = new Date();
		//Calendar calendarioAtual = Calendar.getInstance();
		//System.out.println(data);
		//System.out.println(calendario);
		
		System.out.print("Ano: ");
		ano = leia.nextInt();
		
		System.out.print("Meses: ");
		mes = leia.nextInt();
		
		System.out.print("Dia: ");
		dia = leia.nextInt();
		
		totalAnos = (2022-ano)*365;
		totalMeses = (12-mes)*30;
		totalDias = 30 - dia;
		resultado = totalAnos + totalMeses + totalDias;
		
		System.out.println("voc� tem at� o momento " + resultado + " dias de vida. Parab�ns!");
		
		leia.close();
		
		
		//--OBS: idade aproximada. N�o consegui ainda converter os dados espec�ficos da biblioteca Calendar para dias, meses e anos totais para fazer o c�lculo exato. ;)
		

	}

}
