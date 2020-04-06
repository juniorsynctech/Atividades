package com.api.models.dto;

import java.io.Serializable;

public class ProdutosPorAno implements Serializable{


	private static final long serialVersionUID = 1L;
	private int Ano;
	private String Nome;
	private String Marca;
	private String Vencimento;
	
	public ProdutosPorAno() {
		
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getVencimento() {
		return Vencimento;
	}

	public void setVencimento(String vencimento) {
		Vencimento = vencimento;
	}
	
}
