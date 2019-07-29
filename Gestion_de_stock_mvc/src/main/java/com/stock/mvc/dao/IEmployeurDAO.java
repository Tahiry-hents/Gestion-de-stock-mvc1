package com.stock.mvc.dao;

import java.util.List;

import com.stock.mvc.entites.Employeur;

public interface IEmployeurDAO extends IGenericDAO<Employeur> {
	
	public Employeur save(Employeur entity);
	public Employeur update(Employeur entity);
	public List<Employeur>selectAll();
	public List<Employeur>selectAll(String sortField,String sort);
	public Employeur getById (Long id);
	
	public void remove(Long id);
	public Employeur findOne(String paramName,Object[]paramValue);
	public Employeur findOne(String[] paramNames,Object[] paramValues);
	public Employeur findOne (String paramName,String paramValues);

}
