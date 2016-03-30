package com.trabalho.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.trabalho.Entidade.Curso;
import com.trabalho.Entidade.PresencaAtividade;

public interface UsuarioAtividadeRepositorio extends CrudRepository<PresencaAtividade,Long>{
	
	@Query("from PresencaAtividade where presenca = 'ok'")
	public List<PresencaAtividade> findAllPresenca();

}
