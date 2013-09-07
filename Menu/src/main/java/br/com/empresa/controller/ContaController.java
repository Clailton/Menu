package br.com.empresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContaController {
	
	@RequestMapping(value="/conta")
	public String formConta() {
		return "exibicao/gerenciamento";
	}
	

}
