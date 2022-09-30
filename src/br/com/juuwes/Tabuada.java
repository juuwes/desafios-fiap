package br.com.juuwes;

public class Tabuada {
	
	public static void main(String[] args) {
		
		int l;
		int c = 0;

		int[][] tabuada = new int[11][11];
		for (c = 0; c < tabuada.length; c++) {
			for (l = 0; l < tabuada.length; l++) {
				tabuada[c][l] = c * l;
			}
		}
		
		System.out.printf("%38s\n", "Tabela de Multiplicacao");

// Imprime o numero das colunas
		System.out.printf("%8d", 0);
		for (l = 1; l < tabuada.length; l++) {
			System.out.printf("%4d", l);
		}
		System.out.print("\n");

// Imprime -----
		System.out.print("    ");
		for (l = 0; l < 4 * tabuada.length; l++) {
			System.out.print("-");
		}
		System.out.print("\n");

/* Imprime as linhas da tabela e cada linha precedida pelo indice de linha e uma barra vertical */
		for (c = 0; c < tabuada.length; c += 1) {
			System.out.printf("%3d|", c);
			for (l = 0; l < tabuada.length; l += 1)
				System.out.printf("%4d", tabuada[c][l]);
			System.out.print("\n");
		}
	}
}