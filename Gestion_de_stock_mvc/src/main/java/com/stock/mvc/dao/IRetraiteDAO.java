package com.stock.mvc.dao;

import java.util.List;

import com.stock.mvc.entites.Retraite;

public interface IRetraiteDAO extends IGenericDAO<Retraite> {
	public Retraite save(Retraite entity);
	public Retraite update(Retraite entity);
	public List<Retraite>selectAll();
	public List<Retraite>selectAll(String sortField,String sort);
	public Retraite getById (Long id);
	
	public void remove(Long id);
	public Retraite findOne(String paramName,Object[]paramValue);
	public Retraite findOne(String[] paramNames,Object[] paramValues);
	public Retraite findOne (String paramName,String paramValues);

}
