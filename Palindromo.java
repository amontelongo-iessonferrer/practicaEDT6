package palindromo;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un string para comprobar si es un palíndromo o no:\n> ");
		String texto = limpiarTexto(entrada.nextLine());

		if (esPalindromo(texto)) {
			System.out.println("¡Sí es un palíndromo!");
			
		} else {
			System.out.println("No es un palíndromo.");
		}

	}

	static String limpiarTexto(String texto) {
		if (texto == null) {
			return "";
		}

		// El regex elimina cualquier caracter que no sea específicamente una letra
		return texto.toLowerCase().replaceAll("\\P{L}+", "");
	}

	static boolean esPalindromo(String texto) {

		String textoAlReves = "";

		for (int i = texto.length() - 1; i >= 0; i--) {
			textoAlReves += texto.charAt(i);
		}

		return texto.equals(textoAlReves);
	}
}
