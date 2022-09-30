package br.com.juuwes;

import java.util.Scanner;

public class Detetive {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String questionamentos[] = new String[5];
		String respostas[] = new String[5];
		int conclusao = 0;
		System.out.println("Por favor, responda com sim ou não (s ou n):");
		questionamentos[0] = "Você telefonou para a vítima?";
		questionamentos[1] = "Você esteve no local do crime?";
		questionamentos[2] = "Você mora perto da vítima?";
		questionamentos[3] = "Você devia dinheiro para a vítima?";
		questionamentos[4] = "Você trabalhou com a vítima?";

		for (int i = 0; i < respostas.length; i++) {
			System.out.println(questionamentos[i]);
			respostas[i] = scanner.next();
		}

		for (int i = 0; i < respostas.length; i++) {
			if (respostas[i].equals("sim") || respostas[i].equals("s")) {
				conclusao++;
			}
		}
		
		System.out.println(conclusao);
		
		switch (conclusao) {
		case (2):
			System.out.println("Suspeito");
			break;
		case (3):
			System.out.println("Cúmplice");
			break;
		case (4):
			System.out.println("Cúmplice");
			break;
		case (5):
			System.out.println("Assasino!");
			break;
		default:
			System.out.println("Inocente!");
		}
		scanner.close();
	}
}