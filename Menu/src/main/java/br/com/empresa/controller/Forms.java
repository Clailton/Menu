package br.com.empresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Forms {
	
	@RequestMapping(value="/slideshowindex")
	public String formIframe() {
		return "exibicao/slideshowindex";
	}
	
}
