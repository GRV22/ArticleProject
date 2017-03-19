package com.argnv.article.dao;

import com.argnv.article.Entity.Article;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.security.Permission;
import java.util.List;

/**
 * Created by root on 3/15/17.
 */
public class ArticleDAOImpl implements ArticleDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public void addArticle(Article article) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(article);
    }

    @SuppressWarnings({"unchecked", "JpaQlInspection"})
    public List<Article> getArticles() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Article> articles = session.createQuery("from POST").list();
        for(Article article : articles){

        }
        return articles;
    }

    public Article getArticleById(Long articleId) {
        Session session = this.sessionFactory.getCurrentSession();
        Article article = (Article) session.load(Article.class,articleId);
        return article;
    }
}
