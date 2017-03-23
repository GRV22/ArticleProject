package com.argnv.article.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.argnv.article.Entity.User;

@Repository
public class UserDao extends Dao<User>{

	public User getUserById(Session session,long id) {
		Criteria cr = session.createCriteria(User.class);
		cr.add(Restrictions.eq("id", id));
		User user = (User) cr.uniqueResult();
		return user;
	}
}
