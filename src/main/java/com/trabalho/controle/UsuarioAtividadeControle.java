package com.trabalho.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trabalho.Entidade.PresencaAtividade;
import com.trabalho.Repositorio.AtividadeRepositorio;
import com.trabalho.Repositorio.CursoRepositorio;
import com.trabalho.Repositorio.UsuarioAtividadeRepositorio;
import com.trabalho.Repositorio.UsuarioRepositorio;

@Controller
public class UsuarioAtividadeControle {
	
@Autowired
private UsuarioAtividadeRepositorio uAtividade;

@Autowired
private UsuarioRepositorio uRepositorio;
@Autowired	
	private AtividadeRepositorio atividadeRepositorio;
	
	@Autowired	
	private CursoRepositorio cRepositorio;
	
	
	@RequestMapping(value="/userAtividade")
	public String listarUsuarioAtividade(PresencaAtividade u,Model model){
		
		model.addAttribute("usersA",uAtividade.findAll());
		model.addAttribute("usuarios",uRepositorio.findAll());		
		model.addAttribute("atividades",atividadeRepositorio.findAll());
		model.addAttribute("cursos",cRepositorio.findAll());
		model.addAttribute("u", uAtividade.findAllPresenca());
		
		if(u.getCd_Usuario_Atividade()!=null){
			model.addAttribute("uA",uAtividade.findOne(u.getCd_Usuario_Atividade()));
			
			
		}else{
			
			model.addAttribute("uA",new PresencaAtividade());
		}
		
		return "UsuarioAtividade";
	}
	@RequestMapping(value="/uA/salve")
	public String salvarUsuarioAtividade(PresencaAtividade u){
		
		uAtividade.save(u);
		
		return "redirect:/userAtividade";
	}

}
