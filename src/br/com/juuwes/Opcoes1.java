package br.com.juuwes;

import java.util.Scanner;

public class Opcoes1 {

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

		if (opcao == 1) {
			System.out.println("Consultando Saldo");
		} else if (opcao == 2) {
			System.out.println("Investimentos");
		} else if (opcao == 3) {
			System.out.println("Sacar da Conta Corrente");
		} else if (opcao == 4) {
			System.out.println("Sacar do Cartão de Crédito");
		} else if (opcao == 5) {
			System.out.println("Seguro de Vida");
		} else if (opcao == 6) {
			System.out.println("Seguro de Veíduclo");
		} else {
			System.out.println("Opção Inválida");
		}
		
		scanner.close();
	}
}