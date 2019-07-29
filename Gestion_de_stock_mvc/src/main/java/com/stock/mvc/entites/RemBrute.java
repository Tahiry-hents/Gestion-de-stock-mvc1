package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="REMUNERATIONBRUTE")
public class RemBrute implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="ID")
	private Long idRemBrute;
	@Column(name="SALAIREBASE")
	private String salaireBase;
	@Column(name="HEURESSUP")
	private String heuresSup;
	@Column(name="NUMSECU")
	private int numSecu;
	@Column(name="ABSENCES")
	private String absences;
	public Long getIdRemBrute() {
		return idRemBrute;
	}
	public void setIdRemBrute(Long idRemBrute) {
		this.idRemBrute = idRemBrute;
	}
	public String getSalaireBase() {
		return salaireBase;
	}
	public void setSalaireBase(String salaireBase) {
		this.salaireBase = salaireBase;
	}
	public String getHeuresSup() {
		return heuresSup;
	}
	public void setHeuresSup(String heuresSup) {
		this.heuresSup = heuresSup;
	}
	public int getNumSecu() {
		return numSecu;
	}
	public void setNumSecu(int numSecu) {
		this.numSecu = numSecu;
	}
	public String getAbsences() {
		return absences;
	}
	public void setAbsences(String absences) {
		this.absences = absences;
	}
	public RemBrute() {
		super();
	}
	public RemBrute(Long idRemBrute, String salaireBase, String heuresSup, int numSecu, String absences) {
		super();
		this.idRemBrute = idRemBrute;
		this.salaireBase = salaireBase;
		this.heuresSup = heuresSup;
		this.numSecu = numSecu;
		this.absences = absences;
	}
	
	
}