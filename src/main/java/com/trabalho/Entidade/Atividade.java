package com.trabalho.Entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Atividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cd_Atividade;
	
	@Column(name="data_Inicio", nullable=false, unique=false)		
	private String data_Inicio;
	
	@Column(name="descricao", length=200, nullable=false, unique=false)
	private String descricao;
	
	@Column(name="nome_Atividade", length=200, nullable=false, unique=true)
	private String nome_Atividade;
	
	@Column(name="quantidade_Vagas", nullable=false, unique=false)
	private Integer quantidade_Vagas;
	
	@ManyToOne
	private Curso curso;
	
	
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Atividade() {
		// TODO Auto-generated constructor stub
	}

	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getCd_Atividade() {
		return cd_Atividade;
	}

	public void setCd_Atividade(Long cd_Atividade) {
		this.cd_Atividade = cd_Atividade;
	}

	

	public String getData_Inicio() {
		return data_Inicio;
	}

	public void setData_Inicio(String data_Inicio) {
		this.data_Inicio = data_Inicio;
	}

	public String getNome_Atividade() {
		return nome_Atividade;
	}

	public void setNome_Atividade(String nome_Atividade) {
		this.nome_Atividade = nome_Atividade;
	}

	public Integer getQuantidade_Vagas() {
		return quantidade_Vagas;
	}

	public void setQuantidade_Vagas(Integer quantidade_Vagas) {
		this.quantidade_Vagas = quantidade_Vagas;
	}

	

	
}
