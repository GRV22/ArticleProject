package com.argnv.article.Services;

import java.util.List;

/**
 * Created by root on 4/22/17.
 */
public interface ArticleCategoryService {

    public void addArticleCategories(Long articleId,List<String> categories);
    public List<String> getArticleCategories(Long articleId);
}
