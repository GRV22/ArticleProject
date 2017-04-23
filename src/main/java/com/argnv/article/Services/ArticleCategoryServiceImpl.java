package com.argnv.article.Services;

import com.argnv.article.Models.ArticleCategory;
import com.argnv.article.dao.ArticleCategoryDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by root on 4/22/17.
 */
@Service
public class ArticleCategoryServiceImpl implements ArticleCategoryService {

    private ArticleCategoryDAO articleCategoryDAO;

    public ArticleCategoryDAO getArticleCategoryDAO() {
        return articleCategoryDAO;
    }

    public void setArticleCategoryDAO(ArticleCategoryDAO articleCategoryDAO) {
        this.articleCategoryDAO = articleCategoryDAO;
    }

    @Transactional
    public void addArticleCategories(Long articleId, List<String> categories) {
        this.articleCategoryDAO.addArticleCategory(articleId,categories);
    }

    @Transactional
    public List<String> getArticleCategories(Long articleId) {
        return null;
    }
}
