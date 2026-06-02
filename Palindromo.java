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

		// Cerrar objeto Scanner
		entrada.close();

	}

	static String limpiarTexto(String texto) {
		if (texto == null) {
			return "";
		}

		// El regex elimina cualquier carácter que no sea específicamente una letra
		return texto.toLowerCase().replaceAll("\\P{L}+", "");
	}

	// Método alterna, en vez de crear objetos innecesarios en memoria. Se mira cada
	// carácter desde el principio y desde el final a la vez y comprueba si son
	// iguales o no. Si logra a llegar al medio de la frase, es un palíndromo.
	
	// El medio de la frase sería cuando i supera a j

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
	}
}
