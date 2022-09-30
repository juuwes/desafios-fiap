package br.com.juuwes;

import java.util.Random;

/* Faça um Programa que leia 20 números inteiros e armazene-os num vetor. 
* Armazene os números pares no vetor PAR e os números ÍMPARES no vetor ímpar. Imprima os três vetores. */

public class Sorteio {

	public static void main(String[] args) {
		
		Random random = new Random();
		int valoresSorteados[] = new int[20];
		int valoresPares[] = new int[10];
		int valoresImpares[] = new int[10];
		System.out.println("Os números foram sorteados!!");

		for (int i = 0; i < valoresSorteados.length; i++) {
			valoresSorteados[i] = random.nextInt(50);
			System.out.println("Valores Sorteados: " + valoresSorteados[i]);
			if (valoresSorteados[i] % 2 == 0) {
				valoresPares[i] = valoresSorteados[i];
			} else {
				valoresImpares[i] = valoresSorteados[i];
			}
		}

		for (int i = 0; i < valoresSorteados.length; i++) {
			System.out.println("Valores Sorteados: " + valoresSorteados[i]);
		}
	}
}