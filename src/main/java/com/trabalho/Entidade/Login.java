package com.trabalho.Entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cd_Usuario;
	
	
	@Column(name="tipo", length=200, nullable=false, unique=false)
	private String tipo;
	
	
	
	@Column(name="name", length=200, nullable=false, unique=true)
	private String name;
	
	@Column(name="usuario",length=200,nullable=false,unique=true)
	private String usuario;
	
	@Column(name="senha", nullable=false, unique=true)
	private String senha;
	
	
	
	
	
	

	public Login() {
		// TODO Auto-generated constructor stub
	}







	public String getUsuario() {
		return usuario;
	}







	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}







	public Long getCd_Usuario() {
		return cd_Usuario;
	}







	public void setCd_Usuario(Long cd_Usuario) {
		this.cd_Usuario = cd_Usuario;
	}







	public String getTipo() {
		return tipo;
	}







	public void setTipo(String tipo) {
		this.tipo = tipo;
	}







	public String getName() {
		return name;
	}







	public void setName(String name) {
		this.name = name;
	}







	public String getSenha() {
		return senha;
	}







	public void setSenha(String senha) {
		this.senha = senha;
	}







	







		
}
