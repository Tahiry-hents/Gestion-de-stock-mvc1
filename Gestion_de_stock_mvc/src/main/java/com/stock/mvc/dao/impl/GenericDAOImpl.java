package com.stock.mvc.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.stock.mvc.dao.IGenericDAO;
@SuppressWarnings("unchecked")
public class GenericDAOImpl<T> implements IGenericDAO<T> {
	
	@PersistenceContext
	EntityManager em;
	

	private Class<T> type;
	
	public GenericDAOImpl() {
		super();
		Type f=getClass().getGenericSuperclass();//On récupère la superclasse c'est à dire la classe père
		ParameterizedType pt= (ParameterizedType)f;//On crée l'objet pt en récupérant les paramètres de t
		type= (Class<T>)pt.getActualTypeArguments()[0];
	}

	public GenericDAOImpl(EntityManager em, Class<T> type) {
		super();
		this.em = em;
		this.type = type;
	}
	
	public Class<T> getType() {
		return type;
	}

	@Override
	public T save(T entity) {
		//enregistre une entité T
		em.persist(entity);
		return null;
	}

	@Override
	public T update(T entity) {
		
		return em.merge(entity);
	}

	@Override
	public List<T> selectAll() {
		Query query=em.createQuery("select t from "+type.getSimpleName()+" t");
		return query.getResultList();//Retourne une liste de type t
	}

	@Override
	public List<T> selectAll(String sortField, String sort) {
		//TO DO 
		return null;
	}

	@Override
	public T getById(Long id) {
		
		return em.find(type,id);
	}

	@Override
	public void remove(Long id) {
		T tab=em.getReference(type, id);
		em.remove(tab);//tab est un objet et non un tableau
		
	}

	@Override
	public T findOne(String paramName, Object[] paramValue) {
		//Query query=em.createQuery("select t from "+type.getSimpleName()+"t");
		return null;
	}

	@Override
	public T findOne(String[] paramNames, Object[] paramValues) {
		if (paramNames.length !=paramValues.length) {
		return null;}
		String queryString="select t from "+type.getSimpleName()+" t where";
		int len=paramNames.length;
		for (int i=0;(i<len);i++) { queryString +="e."+paramNames[i]+"=:x"+i;
		if ((i+1)<len) { queryString +="and";}
		}
		Query query = em.createQuery(queryString);
		for (int i=0;(i<paramValues.length);i++) { query.setParameter("x"+i,paramValues[i]);}
		return query.getResultList().size()>0? (T)query.getResultList().get(0): null;
		}
	

	@Override
	public T findOne(String paramName, String paramValues) {
		Query query=em.createQuery("select t from "+type.getSimpleName()+" t where"+paramName+"= :x");
		query.setParameter("x", paramValues);
		return query.getResultList().size()>0? (T)query.getResultList().get(0): null;
		//L'expression précédente équivaut à 
		//if (query.getResultList().size()>0?) {(T)query.getResultList().get(0): null;}
		//else null;
	}

	@Override
	public int findCountBy(String paramName, String paramValues) {//La méthode va retourner le nombre d'éléments contenus dans la liste "type"
		Query query=em.createQuery("select t from"+type.getSimpleName()+"t where"+paramName+"= :x");
		query.setParameter(paramName, paramValues);
		return query.getResultList().size()>0? ((Long)query.getSingleResult()).intValue() :null;
	}

}
