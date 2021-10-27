package br.org.generation.habilidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/habilidade")
public class HabilidadeController {

	@GetMapping
	public String Habilidade ()
	{
		return "Habilidade - Atenção aos detalhes"
				+ "\nMentalidade - Persistencia";
	}
}
