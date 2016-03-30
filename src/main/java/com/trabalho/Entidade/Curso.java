package com.trabalho.Entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long cd_Curso;
	
	@Column(name="nome", length=200, nullable=false, unique=true)
	private String nome;
	
	public Curso() {
		// TODO Auto-generated constructor stub
	}

	public Long getCd_Curso() {
		return cd_Curso;
	}

	public void setCd_Curso(Long cd_Curso) {
		this.cd_Curso = cd_Curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

		
	

}
