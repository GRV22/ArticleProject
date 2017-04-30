package com.argnv.article.dao;

import com.argnv.article.Models.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by root on 4/26/17.
 */
@Repository
public class CategoryDAOImpl implements CategoryDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }


    public void addCategory(Category category) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(category);
    }

    public Category getCategory(String categoryId) {
        Session session = this.sessionFactory.getCurrentSession();
        return (Category) session.load(Category.class,categoryId);
    }

    public void removeCategory(String categoryId) {
        Session session = this.sessionFactory.getCurrentSession();
        Category category = getCategory(categoryId);
        session.delete(category);
    }

    @SuppressWarnings({"unchecked", "JpaQlInspection"})
    public List<Category> getCategories() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Category> categories =  session.createQuery("from Category").list();
        return categories;
    }
}
