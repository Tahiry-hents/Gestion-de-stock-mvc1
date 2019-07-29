package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entites.RemBrute;

public interface IRemBruteService {
	
	public RemBrute save(RemBrute entity);
	public RemBrute update(RemBrute entity);
	public List<RemBrute>selectAll();
	public List<RemBrute>selectAll(String sortField,String sort);
	public RemBrute getById (Long id);
	
	public void remove(Long id);
	public RemBrute findOne(String paramName,Object[]paramValue);
	public RemBrute findOne(String[] paramNames,Object[] paramValues);
	public RemBrute findOne (String paramName,String paramValues);
	public int findCountBy(String paramName,String paramValues);
}
