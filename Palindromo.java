package palindromos;

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

	}
	
	// Metodo que limpia el texto y lo pasa a minusculas para que la comprobacion no de problemas.
	
	static String limpiarTexto(String texto) {

		// Comprobamos que el texto introducido no sea null.
		if (texto == null) {
			return "";
		}

		return texto.toLowerCase().replaceAll("\\P{L}+", "");
	}

	// Metodo que guarda en una variable el texto introducido pero al reves y
	// lo compara.

	static boolean esPalindromo(String texto) {

		String textoAlReves = "";

		// Guardamos el texto introducido al reves en la variable textoAlReves.
		for (int i = texto.length() - 1; i >= 0; i--) {
			textoAlReves += texto.charAt(i);
		}

		// comprobamos si son iguales o no, si lo son devuelve true, si no devuelve false.
		return texto.equals(textoAlReves);
	}
}
