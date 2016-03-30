package com.trabalho.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trabalho.Entidade.Curso;
import com.trabalho.Repositorio.CursoRepositorio;
@Controller
public class CursoControle {
	
	@Autowired
	private CursoRepositorio cursoRepositorio;
	
	@RequestMapping(value="/c")
	
	public String listarCursos(Curso c, Model model){
		
		model.addAttribute("cursos",cursoRepositorio.findAllOrderByNome());
		
		
		if(c.getCd_Curso()!=null){
			model.addAttribute("curs", cursoRepositorio.findOne(c.getCd_Curso()));
			
		}else{
			model.addAttribute("curs", new Curso());
			
		}
		
		return "curso";
		
		
	}
	
	
@RequestMapping(value="/curso/salve")
	
	public String salvarAlunos(Curso c){
		
		cursoRepositorio.save(c);
		
		return "redirect:/c";
	}



}
