package br.com.juuwes;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		int valor1, valor2;
		int soma, subtracao, multiplicacao;
		double divisao;

		Scanner sc = new Scanner(System.in);
		System.out.println("Esse programa vai somar, subtrair, multiplicar e dividir!");
		System.out.print("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = sc.nextInt();
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / valor2;
		System.out.println("A soma desse valor foi de: " + soma 
				+ "\nA subtração desse valor foi de: " + subtracao
				+ "\nA multiplicação desse valor foi de: " + multiplicacao 
				+ "\nA divisão desse valor foi de: " + divisao);

		sc.close();
	}

}
