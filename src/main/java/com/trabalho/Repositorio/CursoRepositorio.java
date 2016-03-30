package com.trabalho.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.trabalho.Entidade.Curso;

public interface CursoRepositorio extends CrudRepository<Curso,Long>{

	
	@Query("from Curso order by nome")
	public List<Curso> findAllOrderByNome();
}
