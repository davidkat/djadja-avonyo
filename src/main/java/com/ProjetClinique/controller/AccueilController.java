package com.ProjetClinique.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccueilController {
	
	@RequestMapping(value="/")
	public String accueil(Model model) {
		return "accueil";
	}
	
	@RequestMapping(value="/testl")
	public String test(Model model) {
		return "accueil";
	}
}
