package br.com.generation.repeticao.exerciciosextras;

	/*4- Uma empresa desenvolveu uma pesquisa para saber as características
	psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	pessoas, calcule e mostre: (WHILE)
	> o número de pessoas calmas;
	> o número de mulheres nervosas;
	> o número de homens agressivos;
	> o número de outros calmos;
	> o número de pessoas nervosas com mais de 40 anos;
	> o número de pessoas calmas com menos de 18 anos.*/

//import java.util.Scanner;
import java.util.Random;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		int p = 0, idade, sexo, sent, pC = 0, mN = 0, hA = 0, oC = 0, nV = 0, cJ = 0;
		
		while (p < 150) {
				/*System.out.println("Idade: ");
				idade = in.nextInt();
				
				System.out.println("Sexo (1 - Fem. | 2 - Masc. | 3 - Outros): ");
				sexo = in.nextInt();
				
				System.out.println("Sentimento (1 - Calma | 2 - Nervosa | 3 - Agresiva): ");
				sent = in.nextInt();*/
			
				idade = random.nextInt(80)+1; //Sistema de sorteio de para calcular masi rapidamente os dados de 150 pessoas
				sexo = random.nextInt(3)+1; //	Fiz depois de testar com sucesso inserindo os dados manualmente.
				sent = random.nextInt(3)+1;	//	O +1 ao lado do random.nextInt()é para sempre adicionar 1 ao numero sorteado e não ter valor 0.
				
				if (sent == 1 ) {		// inicialmente tinha feito com if e else if, mas como uma característica não
					pC++;				// necessariamente anula a outra, deixar todos no formato de if fez mais sentido.
				}
				
				if (sexo == 1 && sent == 2) {
					mN++;
				}
				
				if (sexo == 2 & sent == 3) {
					hA++;
				}
				
				if (sexo == 3 & sent == 1) {
					oC++;
				}
				
				if (idade > 40 & sent == 2) {
						nV++;
				}
				
				if (idade < 18 & sent == 1) {
					cJ++;
				}
				
				p++;
		}
		
		System.out.println("Pessoas consultadas: " + p);
		System.out.println("Pessoas calmas: " + pC);
		System.out.println("Mulheres nervosas: " + mN);
		System.out.println("Homens agressivos: " + hA);
		System.out.println("Outres calmes: " + oC);
		System.out.println("Nervoses com mais de 40 anos: " + nV);
		System.out.println("Calmes com menos de 18 anos: " + cJ);
		
		//in.close();

	}

}
