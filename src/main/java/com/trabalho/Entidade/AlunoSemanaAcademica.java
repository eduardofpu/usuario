package com.trabalho.Entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AlunoSemanaAcademica {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cod_AlunoSemanaAcademica;

	@ManyToOne
	private Login login;
	@ManyToOne
	private Curso curso;
		
	@ManyToOne	
	private Atividade atividade;

	public AlunoSemanaAcademica() {
		// TODO Auto-generated constructor stub
	}

	public Long getCod_AlunoSemanaAcademica() {
		return cod_AlunoSemanaAcademica;
	}

	public void setCod_AlunoSemanaAcademica(Long cod_AlunoSemanaAcademica) {
		this.cod_AlunoSemanaAcademica = cod_AlunoSemanaAcademica;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
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

}
