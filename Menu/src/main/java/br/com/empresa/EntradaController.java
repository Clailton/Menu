package br.com.empresa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EntradaController {
	
	@RequestMapping(value="/entradas")
	public String formEntradas() {
		return "exibicao/entrada";
	}

}
