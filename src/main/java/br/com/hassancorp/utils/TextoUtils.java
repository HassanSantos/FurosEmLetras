package br.com.hassancorp.utils;

import java.util.Arrays;
import java.util.List;

public class TextoUtils {

	private static final List<String> LETRAS_1_BURACO = Arrays.asList("A", "D", "O", "P", "Q", "R", "a", "b", "d", "e",
			"g", "o", "p", "q", "4", "6", "9", "0");

	private static final List<String> LETRAS_2_BURACOS = Arrays.asList("B", "8");

	public static int descobrirNumeroDeBuracos(String texto) {

		int buracos = 0;

		for (int i = 0; i < texto.length(); i++) {

			String letra = String.valueOf(texto.charAt(i));

			if (LETRAS_1_BURACO.contains(letra))
				buracos++;
			else if (LETRAS_2_BURACOS.contains(letra))
				buracos += 2;

		}

		return buracos;

	}

	public static int descobrirNumeroDeCaracteres(String texto) {
		return texto.length();
	}

	public static int descobrirNumeroDePalavras(String texto) {
		return texto.replaceAll(" +", " ").split(" ").length;
	}

	public static void main(String[] args) {
		System.out.println(descobrirNumeroDeBuracos("Hassan Santos Sena"));
		System.out.println(descobrirNumeroDeCaracteres("Hassan Santos Sena"));
		System.out.println(descobrirNumeroDePalavras("Hassan Santos Sena"));
	}

}
