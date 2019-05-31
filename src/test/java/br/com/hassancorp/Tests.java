package br.com.hassancorp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.hassancorp.utils.TextoUtils;

public class Tests {

	@Test
	public void testNumeroDeBuracos() {
		
		assertEquals(Integer.valueOf(18), Integer.valueOf(TextoUtils.descobrirNumeroDeBuracos("ADOPQRabdegopq4690")));
		assertEquals(Integer.valueOf(4), Integer.valueOf(TextoUtils.descobrirNumeroDeBuracos("B8")));
		
	}

	@Test
	public void testNumeroDeCaracteres() {
		assertEquals(Integer.valueOf(18), Integer.valueOf(TextoUtils.descobrirNumeroDeCaracteres("Hassan Santos Sena")));
	}

	@Test
	public void testNumeroDePalavras() {
		assertEquals(Integer.valueOf(3), Integer.valueOf(TextoUtils.descobrirNumeroDePalavras("Hassan          Santos       Sena")));
	}

}
