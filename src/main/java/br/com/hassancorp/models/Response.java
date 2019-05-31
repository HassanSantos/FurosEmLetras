package br.com.hassancorp.models;

import java.io.Serializable;

public class Response implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String texto;

	private Integer tamanho;

	private Integer totalDePalavras;
	
	private Integer totalDeBuracos;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	public Integer getTotalDePalavras() {
		return totalDePalavras;
	}

	public void setTotalDePalavras(Integer totalDePalavras) {
		this.totalDePalavras = totalDePalavras;
	}

	public Integer getTotalDeBuracos() {
		return totalDeBuracos;
	}

	public void setTotalDeBuracos(Integer totalDeBuracos) {
		this.totalDeBuracos = totalDeBuracos;
	}

	


}
