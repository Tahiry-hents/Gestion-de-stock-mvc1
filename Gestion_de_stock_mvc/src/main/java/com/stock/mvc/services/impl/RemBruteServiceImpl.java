package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.dao.IRemBruteDAO;
import com.stock.mvc.entites.RemBrute;

import com.stock.mvc.services.IRemBruteService;

public class RemBruteServiceImpl implements IRemBruteService {
	
	private IRemBruteDAO dao;
	
	

	public void setDao(IRemBruteDAO dao) {
		this.dao = dao;
	}

	@Override
	public RemBrute save(RemBrute entity) {
		
		return dao.save(entity);
	}

	@Override
	public RemBrute update(RemBrute entity) {
		
		return dao.update(entity);
	}

	@Override
	public List<RemBrute> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<RemBrute> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField,sort);
	}

	@Override
	public RemBrute getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RemBrute findOne(String paramName, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RemBrute findOne(String[] paramNames, Object[] paramValues) {
		
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public RemBrute findOne(String paramName, String paramValues) {
		
		return dao.findOne(paramName, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValues) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValues);
	}
             
}
            

