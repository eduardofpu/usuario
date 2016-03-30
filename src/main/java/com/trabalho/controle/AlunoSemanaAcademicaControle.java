package com.trabalho.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trabalho.Entidade.AlunoSemanaAcademica;
import com.trabalho.Entidade.Atividade;
import com.trabalho.Repositorio.AlunoSemanaAcademicaRepositorio;
import com.trabalho.Repositorio.AtividadeRepositorio;
import com.trabalho.Repositorio.CursoRepositorio;
import com.trabalho.Repositorio.UsuarioRepositorio;

//create-drop
@Controller
public class AlunoSemanaAcademicaControle {
	@Autowired
	private AlunoSemanaAcademicaRepositorio repositorio;

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Autowired
	private AtividadeRepositorio atividadeRepositorio;

	@Autowired
	private CursoRepositorio cRepositorio;

	@RequestMapping(value = "/alunoAtividade")
	public String listarAtividades(AlunoSemanaAcademica cadastrar, Model model) {

		model.addAttribute("alunoSemana", repositorio.findAll());
		model.addAttribute("usuario", usuarioRepositorio.findAll());
		model.addAttribute("atividades", atividadeRepositorio.findAll());
		model.addAttribute("cursos", cRepositorio.findAllOrderByNome());

		if (cadastrar.getCod_AlunoSemanaAcademica() != null) {

			model.addAttribute("alunoAcademico", repositorio.findOne(cadastrar.getCod_AlunoSemanaAcademica()));

		} else {

			model.addAttribute("alunoAcademico", new AlunoSemanaAcademica());
		}

		return "AlunoSemanaAcademica";
	}

	@RequestMapping(value = "/alunoAtividade/salve")
	public String salvarAlunoSemana(AlunoSemanaAcademica cadastrar) {

		repositorio.save(cadastrar);

		return "redirect:/alunoAtividade";
	}
	


}
