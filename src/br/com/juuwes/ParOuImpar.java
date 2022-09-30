
/** Classe responsável por verificar se o numero e par ou impar.
 * @see System#out
 * @author juuwes
 * @since 1.0
 * @version 1.1 */

package br.com.juuwes;

public class ParOuImpar {

	/**Operador "percent"/"mod", para identificar numeros impares e pares.
	 * Verificando o resto da divisão e se o numero é divisivel.
	 * 
	 * @param args */

	public static void main(String[] args) {

		int numero = 1501;

		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		if (numero % 3 == 0) {
			System.out.println("DIVISIVEL POR 3");
		} else {
			System.out.println("NÃO É DIVISIVEL POR 3");
		}
	}
}