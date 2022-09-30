package br.com.juuwes;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual o valor da sua renda?");

		double salario = 0;
		double aliquota = 0;
		double valor = 0;

		if (scanner.hasNextDouble()) {
			salario = scanner.nextDouble();
		}

		if (salario <= 1503.98) {
			aliquota = 0;
		} else if (salario <= 2826.65) {
			aliquota = 7.5;
		} else if (salario <= 3751.05) {
			aliquota = 15;
		} else if (salario <= 4664.68) {
			aliquota = 22.5;
		} else {
			aliquota = 27.5;
		}

		System.out.printf("Salário %.2f\n", salario);

		valor = salario * (aliquota / 100);
		System.out.printf("%s%.2f", "Imposto devido: R$ ", valor);

		scanner.close();
	}
}