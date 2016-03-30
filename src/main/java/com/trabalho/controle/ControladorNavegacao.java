package com.trabalho.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trabalho.Repositorio.UsuarioAtividadeRepositorio;

@Controller
public class ControladorNavegacao {
	@Autowired
	private UsuarioAtividadeRepositorio uAtividade;

	@RequestMapping("/")
	public String goLogout() {
		return "logout";
	}

	@RequestMapping("/presenca")
	public String goPresencat(Model model) {

		model.addAttribute("u", uAtividade.findAllPresenca());
		return "presenca";
	}

	@RequestMapping("/login")
	public String goLogin() {
		return "login";
	}

	@RequestMapping("/admin")
	public String goAdmin() {
		return "admin";
	}

}
