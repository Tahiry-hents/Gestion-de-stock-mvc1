package com.stock.mvc.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEUR")

public class Employeur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="ID")
	private Long idEmpl;
	@Column(name="RAISONSOCIALE")
	private String raisonSociale;
	@Column(name="ADRESSE")
	private String adresse;
	@Column(name="CODEPOSTAL")
	private String codePostal;
	
	@OneToMany(mappedBy="idEmpl")
	private List<Salaire>salaire;
	
	
	public List<Salaire> getSalaire() {
		return salaire;
	}
	public void setSalaire(List<Salaire> salaire) {
		this.salaire = salaire;
	}
	public Long getIdEmpl() {
		return idEmpl;
	}
	public void setIdEmpl(Long idEmpl) {
		this.idEmpl = idEmpl;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public Employeur() {
		super();
	}
	public Employeur(Long idEmpl, String raisonSociale, String adresse, String codePostal) {
		super();
		this.idEmpl = idEmpl;
		this.raisonSociale = raisonSociale;
		this.adresse = adresse;
		this.codePostal = codePostal;
	}
	
	
	
}
