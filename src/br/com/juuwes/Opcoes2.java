package br.com.juuwes;

import java.util.Scanner;

public class Opcoes2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem Vindo ao Sistema\n");
		System.out.println("Digite a opção desejada\n");
		System.out.println("[1] Consultar Saldo");
		System.out.println("[2] Investimentos");
		System.out.println("[3] Sacar da Conta Corrente");
		System.out.println("[4] Sacar do Cartão de Crédito");
		System.out.println("[5] Seguro de Vida");
		System.out.println("[6] Seguro de Veículo");

		int opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Consultando Saldo");
			break;
		case 2:
			System.out.println("Investimentos");
			break;
		case 3:
			System.out.println("Sacar da Conta Corrente");
			break;
		case 4:
			System.out.println("Sacar do Cartão de Crédito");
			break;
		case 5:
			System.out.println("Seguro de Vida");
			break;
		case 6:
			System.out.println("Seguro de Veíduclo");
			break;
		default:
			System.out.println("Opção Inválida");
		}

		scanner.close();
	}
}
