package com.argnv.article.Services;

import com.argnv.article.Models.Article;

import java.util.List;

/**
 * Created by root on 3/15/17.
 */
public interface ArticleService {

    public Long addArticle(Article article);
    public List<Article> getArticles();
    public Article getArticleById(Long articleId);

}
