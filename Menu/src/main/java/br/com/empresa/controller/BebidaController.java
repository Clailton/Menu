package br.com.empresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BebidaController {
	//testando comit
	
	@RequestMapping(value="/bebidas")
	public String formBebidas() {
		return "exibicao/bebidas";
	}

}
