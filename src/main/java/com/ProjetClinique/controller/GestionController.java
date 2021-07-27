package com.ProjetClinique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ProjetClinique.dao.Specialite;
import com.ProjetClinique.services.ProjetCliniqueServiceImplement;

@Controller
public class GestionController {
	
	@Autowired
	private ProjetCliniqueServiceImplement projetCliniqueServiceImplement;
	
	@RequestMapping(value="/gestion")
	public String gestion(Model model) {
		return "gestion";
	}
	
	@PostMapping("/ajouterSpecialite")
	public String creerSpecialie(Model model,Specialite specialite) {
		projetCliniqueServiceImplement.creerSpecialite(specialite);
		return "gestion";
	}
}
