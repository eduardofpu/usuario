package com.trabalho.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.trabalho.Entidade.Login;
import com.trabalho.Repositorio.CursoRepositorio;
import com.trabalho.Repositorio.UsuarioRepositorio;

@Controller
public class LoginControle {
	
	@Autowired
	
	private UsuarioRepositorio usuarioRepositorio;
	
	
	
	@RequestMapping(value="/user")
	
	public String listarUsuarios(Login usuario, Model model){
		
		model.addAttribute("usuarios", usuarioRepositorio.findAll());
		
		if(usuario.getCd_Usuario()!=null){
			model.addAttribute("u", usuarioRepositorio.findOne(usuario.getCd_Usuario()));
			
		}else{
			model.addAttribute("u", new Login()); 
		}
		
		return "usuario";
	}
	
	@RequestMapping(value="/usuario/salve")
	
	public String salvarAlunos(Login usuario){
		
		usuarioRepositorio.save(usuario);
		
		return "redirect:/user";
	}

}
