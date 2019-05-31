package br.com.hassancorp.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hassancorp.models.Response;
import br.com.hassancorp.utils.TextoUtils;

@RestController
public class TextoController {

	@PostMapping("/text-information")
	public Response getInformationAboutText(HttpEntity<String> httpEntity) {
		
		String texto = httpEntity.getBody();
		
		Response response = new Response();
		response.setTexto(texto);
		response.setTotalDeBuracos(TextoUtils.descobrirNumeroDeBuracos(texto));
		response.setTotalDePalavras(TextoUtils.descobrirNumeroDePalavras(texto));
		response.setTamanho(TextoUtils.descobrirNumeroDeCaracteres(texto));
		
		return response;
	}
	
	
	
}
