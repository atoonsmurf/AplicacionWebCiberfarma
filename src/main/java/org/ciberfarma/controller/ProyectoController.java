package org.ciberfarma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProyectoController {

	@GetMapping("/")
	public String inicio(Model model) {
		return "principal";
	}
}
