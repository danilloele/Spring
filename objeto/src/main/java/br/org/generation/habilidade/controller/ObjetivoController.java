package br.org.generation.habilidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivo")
public class ObjetivoController {

	@GetMapping
	public String Objetivo ()
	{
		return "Absorver conhecimentos relacionados ao Spring";
	}
}
