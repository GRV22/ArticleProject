package com.argnv.article.dao;

import com.argnv.article.Entity.Article;

import java.util.List;

/**
 * Created by root on 3/15/17.
 */
public interface ArticleDAO {

    public void addArticle(Article article);
    public List<Article> getArticles();
    public Article getArticleById(Long articleId);

}
