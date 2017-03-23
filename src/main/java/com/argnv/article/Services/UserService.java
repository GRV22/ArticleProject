package com.argnv.article.Services;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argnv.article.Entity.User;
import com.argnv.article.config.Config;
import com.argnv.article.dao.DaoFactory;
import com.argnv.article.utils.JSONConverter;

@Service
public class UserService extends GenericService {

	@Autowired
	public UserService(DaoFactory daoFactory, Config config) {
		super(daoFactory, config);
	}

	public String getUserById(long userId) throws Exception {
		
		Session session = getSession();
		try {
			User user = daoFactory.getUserDao().getUserById(session, userId); 
			if(user == null) {
				return JSONConverter.getFailJSONObjectWithReason("No User exist with this Id");
			}
			return JSONConverter.getSuccessJSONObjectFromModel(user);
		} catch (Exception e) {
			throw e;
		}
		finally {
			session.close();
		}
	}

}
