package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IRetraiteDAO;
import com.stock.mvc.entites.Retraite;

import com.stock.mvc.services.IRetraiteService;

@Transactional
public class RetraiteServiceImpl implements IRetraiteService {
	
	private IRetraiteDAO dao;
	
	

	public void setDao(IRetraiteDAO dao) {
		this.dao = dao;
	}

	@Override
	public Retraite save(Retraite entity) {
		
		return dao.save(entity);
	}

	@Override
	public Retraite update(Retraite entity) {
		
		return dao.update(entity);
	}

	@Override
	public List<Retraite> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<Retraite> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField,sort);
	}

	@Override
	public Retraite getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Retraite findOne(String paramName, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Retraite findOne(String[] paramNames, Object[] paramValues) {
		
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public Retraite findOne(String paramName, String paramValues) {
		
		return dao.findOne(paramName, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValues) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValues);
	}
             
}
            
