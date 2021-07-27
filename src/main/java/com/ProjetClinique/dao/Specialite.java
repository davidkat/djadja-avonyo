package com.ProjetClinique.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Specialite {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_specialite;
	
	@Column(nullable = false)
	private String nom_specialite;
	
	@Column(nullable = false)
	private  String resum_specialite;
	
	@Column(nullable = false)
	private  String detail_specialite;
	
	@Column(nullable = false)
	private  Date dte_creation;
	
	@Column(nullable = false)
	private  Date dte_mod;
	
	@Column(nullable = false)
	private  boolean isDelete;

	public Specialite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specialite(String nom_specialite, String resum_specialite, String detail_specialite, Date dte_creation,
			boolean isDelete) {
		super();
		this.nom_specialite = nom_specialite;
		this.resum_specialite = resum_specialite;
		this.detail_specialite = detail_specialite;
		this.dte_creation = dte_creation;
		this.isDelete = isDelete;
	}

	public Long getId_specialite() {
		return id_specialite;
	}

	public void setId_specialite(Long id_specialite) {
		this.id_specialite = id_specialite;
	}

	public String getNom_specialite() {
		return nom_specialite;
	}

	public void setNom_specialite(String nom_specialite) {
		this.nom_specialite = nom_specialite;
	}

	public String getResum_specialite() {
		return resum_specialite;
	}

	public void setResum_specialite(String resum_specialite) {
		this.resum_specialite = resum_specialite;
	}

	public String getDetail_specialite() {
		return detail_specialite;
	}

	public void setDetail_specialite(String detail_specialite) {
		this.detail_specialite = detail_specialite;
	}

	public Date getDte_creation() {
		return dte_creation;
	}

	public void setDte_creation(Date dte_creation) {
		this.dte_creation = dte_creation;
	}

	public Date getDte_mod() {
		return dte_mod;
	}

	public void setDte_mod(Date dte_mod) {
		this.dte_mod = dte_mod;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
	
}
