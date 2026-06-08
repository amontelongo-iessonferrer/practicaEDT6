package palindromoOliver;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un string para comprobar si es un palíndromo o no:\n> ");
		String texto = limpiarTexto(entrada.nextLine());

		// Comprobamos si el texto introducido es palindromo con el metodo esPalindromo
		if (esPalindromo(texto)) {
			System.out.println("¡Sí es un palíndromo!");

		} else {
			System.out.println("No es un palíndromo.");
		}

		// Cerrar objeto Scanner
		entrada.close();

	}

	// Metodo que limpia el texto y lo pasa a minusculas para que la comprobacion no
	// de problemas.

	static String limpiarTexto(String texto) {

		// Comprobamos que el texto introducido no sea null.
		if (texto == null) {
			return "";
		}

	// Método alterna, en vez de crear objetos innecesarios en memoria. Se mira cada
	// carácter desde el principio y desde el final a la vez y comprueba si son
	// iguales o no. Si logra a llegar al medio de la frase, es un palíndromo.

	// El medio de la frase sería cuando i supera a j
	return texto.toLowerCase().replaceAll("\\P{L}+","");

	}

	// Metodo que guarda en una variable el texto introducido pero al reves y
	// lo compara.

	static boolean esPalindromo(String texto) {

		int i = 0;
		int j = texto.length() - 1;

		while (i < j) {
			if (texto.charAt(i) != texto.charAt(j)) {
				return false;

			}
			i++;
			j--;
		}
		return true;
		// comprobamos si son iguales o no, si lo son devuelve true, si no devuelve false.
	}
}
