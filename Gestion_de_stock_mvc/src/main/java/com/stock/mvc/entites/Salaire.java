package com.stock.mvc.entites;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SALAIRE")

public class Salaire implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="ID")
	private Long idSalaire;
	@Column(name="SALAIRENET")
	private BigDecimal salaireNet;
	@Column(name="CONGESPAYES")
	private String congesPayes;
	@Column(name="DATENETAPAYER")
	private String dateNetaPayer;
	
	@OneToOne(mappedBy="salaire")
	private Retraite retraite;
	
	@OneToOne(mappedBy="salaire")
	private Sante sante;
	
	@Column(name="idEmpl",nullable=false)
	private Long idEmpl;
	
	
	public Long getIdSalaire() {
		return idSalaire;
	}
	public void setIdSalaire(Long idSalaire) {
		this.idSalaire = idSalaire;
	}
	public BigDecimal getSalaireNet() {
		return salaireNet;
	}
	public void setSalaireNet(BigDecimal salaireNet) {
		this.salaireNet = salaireNet;
	}
	public String getCongesPayes() {
		return congesPayes;
	}
	public void setCongesPayes(String congesPayes) {
		this.congesPayes = congesPayes;
	}
	public String getDateNetaPayer() {
		return dateNetaPayer;
	}
	public void setDateNetaPayer(String dateNetaPayer) {
		this.dateNetaPayer = dateNetaPayer;
	}
	public Salaire(Long idSalaire, BigDecimal salaireNet, String congesPayes, String dateNetaPayer) {
		super();
		this.idSalaire = idSalaire;
		this.salaireNet = salaireNet;
		this.congesPayes = congesPayes;
		this.dateNetaPayer = dateNetaPayer;
	}
	public Salaire() {
		super();
	}
}
