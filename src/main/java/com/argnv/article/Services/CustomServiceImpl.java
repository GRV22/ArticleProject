package com.argnv.article.Services;


import com.argnv.article.Models.Article;
import com.argnv.article.dao.ArticleCategoryDAO;
import com.argnv.article.dao.ArticleDAO;
import com.argnv.article.dao.CustomDAO;
import com.argnv.article.dto.CustomDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 4/11/17.
 */
@Service
public class CustomServiceImpl implements CustomService{

    private ArticleDAO articleDAO;
    private CustomDAO customDAO;
    private ArticleCategoryDAO articleCategoryDAO;

    @Transactional
    public void addArticleDetails(CustomDTO customDTO) {

        Article article = new Article();
        article.setHeading(customDTO.getHeading());
        article.setDescription(customDTO.getDescription());
        article.setCreationTime(customDTO.getCreationTime());
        Long articleId = this.articleDAO.saveArticle(article);
        List<String> categories = customDTO.getCategory();
        this.articleCategoryDAO.addArticleCategory(articleId,categories);
    }

    public List<CustomDTO> getArticleDetails() {
        return null;
    }

    public void setCustomDAO(CustomDAO customDAO) {
        this.customDAO = customDAO;
    }

    public CustomDAO getCustomDAO() {
        return customDAO;
    }

    public ArticleDAO getArticleDAO() {
        return articleDAO;
    }

    public void setArticleDAO(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }
}
