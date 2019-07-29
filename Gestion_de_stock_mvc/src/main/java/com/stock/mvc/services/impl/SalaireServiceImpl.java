package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.dao.ISalaireDAO;
import com.stock.mvc.entites.Salaire;

import com.stock.mvc.services.ISalaireService;

public class SalaireServiceImpl implements ISalaireService {
	
	private ISalaireDAO dao;
	

	public void setDao(ISalaireDAO dao) {
		this.dao = dao;
	}

	@Override
	public Salaire save(Salaire entity) {
		
		return dao.save(entity);
	}

	@Override
	public Salaire update(Salaire entity) {
		return dao.update(entity);
	}

	@Override
	public List<Salaire> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<Salaire> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField,sort);
	}

	@Override
	public Salaire getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Salaire findOne(String paramName, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salaire findOne(String[] paramNames, Object[] paramValues) {
		
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public Salaire findOne(String paramName, String paramValues) {
		
		return dao.findOne(paramName, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValues) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValues);
	}
             
}
            
