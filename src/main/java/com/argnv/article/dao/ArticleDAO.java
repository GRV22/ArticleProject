package com.argnv.article.dao;

import com.argnv.article.Models.Article;

import java.util.List;

/**
 * Created by root on 3/15/17.
 */
public interface ArticleDAO {

    public Long saveArticle(Article article);
    public List<Article> getArticles();
    public Article getArticleById(Long articleId);

}
