package com.argnv.article.dao;

import java.util.ArrayList;
import java.util.Map;
import javax.persistence.NonUniqueResultException;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Dao<T> {

	

	public T insert(Session session,T t) throws Exception {
		try {
			session.save(t);
			return t;
		} catch (Exception e) {
			throw e;
		}
	}

	public T update(Session session, T t) throws Exception {
		try {
			session.update(t);
			return t;
		} catch (Exception e) {
			throw e;
		}
	}

	public <T> T getById(Session session,long id,Class<T> clazz) throws Exception {
		try {
			T t = (T) session.get(clazz, id);
			return t;
		} catch (Exception e) {
			throw e;
		}
	}

	public T getbyUniqueColumn (Session session, String columnName, Object value, Class<T> clazz) throws NonUniqueResultException{

		Criteria cr = session.createCriteria(clazz);
		cr.add(Restrictions.eq(columnName, value));

		try{
			T t = (T)cr.uniqueResult();

			return t;
		}catch(NonUniqueResultException e){
			e.printStackTrace();
			throw new NonUniqueResultException();
		}finally{


		}
	}

	public ArrayList<T> getlistbyUniqueColumn (Session session, String columnName, Object value, Class<T> clazz){

		Criteria cr = session.createCriteria(clazz);
		cr.add(Restrictions.eq(columnName, value));
		try{
			ArrayList<T> t = (ArrayList<T>)cr.list();

			return t;
		}catch(NonUniqueResultException e){
			e.printStackTrace();
			throw new NonUniqueResultException();
		}finally{

		}
	}

	public T getbyUniqueColumns (Session session, Map<String,Object> map , Class<T> clazz)throws Exception {

		Criteria cr = session.createCriteria(clazz);
		cr.add(Restrictions.allEq(map));
		try{
			T t = (T)cr.uniqueResult();

			return t;

		}catch(Exception e){
			throw e;
		}finally{

		}
	}



}
