package com.stock.mvc.dao;

import java.util.List;

import com.stock.mvc.entites.Sante;

public interface ISanteDAO extends IGenericDAO<Sante> {
	public Sante save(Sante entity);
	public Sante update(Sante entity);
	public List<Sante>selectAll();
	public List<Sante>selectAll(String sortField,String sort);
	public Sante getById (Long id);
	
	public void remove(Long id);
	public Sante findOne(String paramName,Object[]paramValue);
	public Sante findOne(String[] paramNames,Object[] paramValues);
	public Sante findOne (String paramName,String paramValues);
	public int findCountBy(String paramName,String paramValues);
}
