package br.com.juuwes;

/* Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor.
 * Imprima a idade e a altura na ordem inversa a ordem lida. */

import java.util.Scanner;

public class Consulta {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantas pessoas irão se consultar?");
		byte numeroDeAtendidos = scanner.nextByte();

		float altura[] = new float[numeroDeAtendidos];
		byte idade[] = new byte[numeroDeAtendidos];

		for (int i = 0; i < numeroDeAtendidos; i++) {
			System.out.println("Qual a altura da " + (i + 1) + "ª pessoa?");
			altura[i] = scanner.nextFloat();
			System.out.println("Qual a idade da " + (i + 1) + "ª pessoa?");
			idade[i] = scanner.nextByte();
		}
		
		for (int i = numeroDeAtendidos; i > 0; i--) {
			System.out.println("Número de pessoas consultadas: " + numeroDeAtendidos + "\n" + i + "ª Pessoa - Altura: "
					+ altura[i - 1] + ", Idade: " + idade[i - 1]);
		}
		
		scanner.close();
	}
}