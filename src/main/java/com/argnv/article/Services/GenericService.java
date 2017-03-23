package com.argnv.article.Services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.argnv.article.config.Config;
import com.argnv.article.dao.DaoFactory;

public class GenericService {

	DaoFactory daoFactory;
	SessionFactory sessionFactory;
	public GenericService(DaoFactory daoFactory,Config config) {
		this.daoFactory = daoFactory;
		this.sessionFactory = config.getSessionFactory();
	}
	
	public Session getSession() {
		Session session = sessionFactory.openSession();
		return session;
	}
	
	public void close(Session session) {
		session.close();
	}
	
}
