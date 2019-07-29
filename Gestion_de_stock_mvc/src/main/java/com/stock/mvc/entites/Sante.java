package com.stock.mvc.entites;

import java.io.Serializable;

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
@Table(name="SANTE")
public class Sante implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="ID")
	private Long idSante;
	@Column(name="SECURITESOCIALE")
	private int secuSociale;
	@Column(name="COMPLEMENTAIREA")
	private String compleTA;
	@Column(name="COMPLEMENTAIREB")
	private int compleTB;
	@Column(name="COMPLESANTE")
	private String compleSante;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="sante_idSalaire",unique=true)
	private Salaire salaire;
	
	public Long getIdSante() {
		return idSante;
	}
	public void setIdSante(Long idSante) {
		this.idSante = idSante;
	}
	public int getSecuSociale() {
		return secuSociale;
	}
	public void setSecuSociale(int secuSociale) {
		this.secuSociale = secuSociale;
	}
	public String getCompleTA() {
		return compleTA;
	}
	public void setCompleTA(String compleTA) {
		this.compleTA = compleTA;
	}
	public int getCompleTB() {
		return compleTB;
	}
	public void setCompleTB(int compleTB) {
		this.compleTB = compleTB;
	}
	public String getCompleSante() {
		return compleSante;
	}
	public void setCompleSante(String compleSante) {
		this.compleSante = compleSante;
	}
	public Sante() {
		super();
	}
	public Sante(Long idSante, int secuSociale, String compleTA, int compleTB, String compleSante) {
		super();
		this.idSante = idSante;
		this.secuSociale = secuSociale;
		this.compleTA = compleTA;
		this.compleTB = compleTB;
		this.compleSante = compleSante;
	}
	
}