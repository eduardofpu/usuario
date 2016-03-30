package com.trabalho.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.trabalho.Entidade.Login;

public interface UsuarioRepositorio extends CrudRepository<Login,Long>{
	
	
	

}
