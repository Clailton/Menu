package br.com.empresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EspecialidadeController {
	
	@RequestMapping(value="/especialidades")
	public String formEspecialidades() {
		return "exibicao/especialidades";
	}

}
