package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="SALARIE")
public class Salarie implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="ID")
	private Long id;
	@Column(name="NOM")
	private String nom;
	@Column(name="PRENOM")
	private String prenom;
	@Column(name="NUMSECU")
	private int numSecu;
	@Column(name="EMAIL")
	private String email;
	@Column(name="TELEPHONE")
	private int telephone;
	
	
	@ManyToOne
	@JoinColumn(name="employeur_id")
	
	private Employeur employeur;	
	public Salarie(String nom, String prenom, Employeur employeur) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.employeur = employeur;
		
		
	}
	
	
	
	
	
	
	
	public void setId( Long id) {
		this.id = id;
	}
	public void setNom( String nom) {
		this.nom = nom;
	}
	public void setPrenom( String prenom) {
		this.prenom = prenom;
	}
	public void setNumSecu( int numSecu) {
		this.numSecu = numSecu;
	}
	public void setEmail( String email) {
		this.email = email;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public Long getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getNumSecu() {
		return numSecu;
	}
	public String getEmail() {
		return email;
	}
	public int getTelephone() {
		return telephone;
	}
	public Salarie() {
		super();
	}
	public Salarie(Long id, String nom, String prenom, int numSecu, String email, int telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.numSecu = numSecu;
		this.email = email;
		this.telephone = telephone;
	}


}
