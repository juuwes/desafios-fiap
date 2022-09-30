package br.com.juuwes;

import java.util.Scanner;

public class Notas {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual sua primeria nota?");
		int nota1 = scanner.nextInt();

		System.out.println("Qual sua segunda nota?");
		int nota2 = scanner.nextInt();

		System.out.println("Qual sua terceira nota?");
		int nota3 = scanner.nextInt();

		System.out.println("Qual sua quarta nota?");
		int nota4 = scanner.nextInt();

		int notas[] = { nota1, nota2, nota3, nota4 };
		double soma = 0;
		double media = 0;

		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}

		media = soma / (notas.length);
		System.out.println("Média da Nota: " + media);
		scanner.close();
	}
}