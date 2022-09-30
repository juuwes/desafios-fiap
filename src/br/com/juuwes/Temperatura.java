package br.com.juuwes;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("pt", "BR"));
		Scanner sc = new Scanner(System.in);

		double[] temperaturas = new double[12];

		double soma = 0;

		for (int i = 0; i < 12; i++) {
			System.out.println("Informe a temperatura para "
					+ Month.JANUARY.plus(i).getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()) + ": ");
			temperaturas[i] = sc.nextDouble();
			soma += temperaturas[i];
		}

		double media = soma / temperaturas.length;

		System.out.printf("\n\nTemperatura média: %.1f%s\n", media, "ºC.");

		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] > media) {
				System.out.printf(
						"\nEm " + Month.JANUARY.plus(i).getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault())
								+ " a temperatura média foi de " + temperaturas[i]
								+ "ºC. Acima da média anual que foi de %.1f%s\n",
						media, "ºC.");
			}
		}

		sc.close();
	}
}