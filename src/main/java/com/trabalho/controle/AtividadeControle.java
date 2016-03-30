package com.trabalho.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trabalho.Entidade.Atividade;
import com.trabalho.Repositorio.AtividadeRepositorio;
import com.trabalho.Repositorio.CursoRepositorio;
//create-drop
@Controller
public class AtividadeControle {
	@Autowired	
	private AtividadeRepositorio atividadeRepositorio;
	
	@Autowired	
	private CursoRepositorio cRepositorio;
	
	
	@RequestMapping(value="/atividade")
	public String listarAtividades(Atividade atividade,Model model){
		
		model.addAttribute("atividades",atividadeRepositorio.findAll());
		model.addAttribute("cursos", cRepositorio.findAllOrderByNome());
		
		if(atividade.getCd_Atividade()!=null){
			
			model.addAttribute("a",atividadeRepositorio.findOne(atividade.getCd_Atividade()));
			
		}else{
			
			model.addAttribute("a",new Atividade());
		}
		
		return "atividade";
	}
	
	@RequestMapping(value="/atividade/salve")
	public String salvarAtividade(Atividade atividade){
		
		atividadeRepositorio.save(atividade);
		
		return "redirect:/atividade";
	}

}
