package com.argnv.article.dao;

import com.argnv.article.Models.ArticleCategory;
import com.argnv.article.Models.ArticleCategoryKey;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by root on 4/15/17.
 */
@Repository
public class ArticleCategoryDAOImpl implements ArticleCategoryDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public void addArticleCategory(Long articleId, List<String> categories) {
        Session session = this.sessionFactory.getCurrentSession();
        for(String categoryId : categories){
            ArticleCategory articleCategory = new ArticleCategory();
            ArticleCategoryKey articleCategoryKey = new ArticleCategoryKey();
            articleCategoryKey.setArticleId(articleId);
            articleCategoryKey.setCategeryId(categoryId);
            articleCategory.setKey(articleCategoryKey);
            session.save(articleCategory);
        }
    }

    public List<String> getArticleCategory(Long articleId) {
        Session session = this.sessionFactory.getCurrentSession();
        return null;
    }
}
