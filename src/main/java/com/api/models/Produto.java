package com.api.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_produtos")
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String Nome;
	private String Marca;
	private String Vencimento;
	private String LocalFabricacao;
	private int AnoFabricação;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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


	public String getLocalFabricacao() {
		return LocalFabricacao;
	}


	public void setLocalFabricacao(String localFabricacao) {
		LocalFabricacao = localFabricacao;
	}


	public int getAnoFabricação() {
		return AnoFabricação;
	}


	public void setAnoFabricação(int anoFabricação) {
		AnoFabricação = anoFabricação;
	}
	
}
