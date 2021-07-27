package com.ProjetClinique.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ProjetClinique.dao.Specialite;
import com.ProjetClinique.iservice.ProjetCliniqueService;
import com.ProjetClinique.repository.SpecialiteRepository;

@Service
@Transactional
public class ProjetCliniqueServiceImplement implements ProjetCliniqueService {

	@Autowired
	private SpecialiteRepository specialiteRepository;
	
	public void creerSpecialite(Specialite specialite){
		specialiteRepository.save(specialite);
	}

	
}
