package com.onsystem.controles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controle {
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
}
