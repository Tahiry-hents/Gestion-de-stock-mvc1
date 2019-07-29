package com.stock.mvc.services.impl;

import java.util.List;



import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ISalarieDAO;
import com.stock.mvc.entites.Salarie;

import com.stock.mvc.services.ISalarieService;

@Transactional
public class SalarieServiceImpl implements ISalarieService {
	
	private ISalarieDAO dao;

	public void setDao(ISalarieDAO dao) {
		this.dao = dao;
	}

	@Override
	public Salarie save(Salarie entity) {
		
		return null;
	}

	@Override
	public Salarie update(Salarie entity) {
		
		return null;
	}
	
	@Override
	public List<Salarie> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Salarie> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salarie getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Salarie findOne(String paramName, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salarie findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salarie findOne(String paramName, String paramValues) {
		// TODO Auto-generated method stub
		return null;
	}
	
//rajouter les methodes et les modifier 
//ne pas faire List<Salarie>...sort
}
