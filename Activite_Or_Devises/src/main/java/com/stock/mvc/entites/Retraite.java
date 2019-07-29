package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RETRAITE")

public class Retraite implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="ID")
	private Long idRetraite;
	@Column(name="COMPLEMENTAIRET1")
	private String compleT1;
	@Column(name="COMPLEMENTAIRET2")
	private String compleT2;
	public Long getIdRetraite() {
		return idRetraite;
	}
	public void setIdRetraite(Long idRetraite) {
		this.idRetraite = idRetraite;
	}
	public String getCompleT1() {
		return compleT1;
	}
	public void setCompleT1(String compleT1) {
		this.compleT1 = compleT1;
	}
	public String getCompleT2() {
		return compleT2;
	}
	public void setCompleT2(String compleT2) {
		this.compleT2 = compleT2;
	}
	public Retraite() {
		super();
	}
	public Retraite(Long idRetraite, String compleT1, String compleT2) {
		super();
		this.idRetraite = idRetraite;
		this.compleT1 = compleT1;
		this.compleT2 = compleT2;
	}
	
}