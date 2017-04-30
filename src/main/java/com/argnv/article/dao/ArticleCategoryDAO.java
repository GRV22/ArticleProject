package com.argnv.article.dao;

import java.util.List;

/**
 * Created by root on 4/15/17.
 */
public interface ArticleCategoryDAO {
    public void addArticleCategory(Long articleId,List<String> categories);
    public List<String> getArticleCategory(Long articleId);
}
