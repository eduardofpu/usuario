package com.trabalho.Entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class PresencaAtividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long cd_Usuario_Atividade;
	@Column(name="presenca", length=200, nullable=false, unique=false)
	private String presenca;
	
	@ManyToOne
	private Curso curso;
	
	@ManyToOne
	private Atividade atividade;
	
	@ManyToOne
	private Login usuario;
	
	public PresencaAtividade() {
		// TODO Auto-generated constructor stub
	}

	public Long getCd_Usuario_Atividade() {
		return cd_Usuario_Atividade;
	}

	public void setCd_Usuario_Atividade(Long cd_Usuario_Atividade) {
		this.cd_Usuario_Atividade = cd_Usuario_Atividade;
	}

	public String getPresenca() {
		return presenca;
	}

	public void setPresenca(String presenca) {
		this.presenca = presenca;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public Login getUsuario() {
		return usuario;
	}

	public void setUsuario(Login usuario) {
		this.usuario = usuario;
	}
	
	
	
	}
