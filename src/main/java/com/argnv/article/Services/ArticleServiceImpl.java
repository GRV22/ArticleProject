package com.argnv.article.Services;

import com.argnv.article.Models.Article;
import com.argnv.article.dao.ArticleDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by root on 3/15/17.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleDAO articleDAO;

    public void setArticleDAO(ArticleDAO articleDAO){
        this.articleDAO = articleDAO;
    }

    @Transactional
    public void addArticle(Article article) {
        this.articleDAO.addArticle(article);
    }

    @Transactional
    public List<Article> getArticles() {
        return this.articleDAO.getArticles();
    }

    @Transactional
    public Article getArticleById(Long articleId) {
        return this.articleDAO.getArticleById(articleId);
    }
}
