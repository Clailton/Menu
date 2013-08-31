package br.com.empresa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BebidaController {
	
	
	@RequestMapping(value="/bebidas")
	public String formBebidas() {
		return "exibicao/bebidas";
	}

}
