package com.argnv.article.controller;

import com.argnv.article.Models.Article;
import com.argnv.article.Models.ArticleCategory;
import com.argnv.article.Services.ArticleCategoryService;
import com.argnv.article.Services.ArticleService;
import com.argnv.article.Services.CustomService;
import com.argnv.article.dto.CustomDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by root on 3/20/17.
 */
@RestController
public class ArticleController {

    private ArticleService articleService;
    private ArticleCategoryService articleCategoryService;
    private CustomService customService;

    @Autowired(required = true)
    @Qualifier(value = "articleService")
    public void setArticleService(ArticleService articleService){
        this.articleService = articleService;
    }

    @Autowired(required = true)
    @Qualifier(value = "articleCategoryService")
    public void setArticleCategoryService(ArticleCategoryService articleCategoryService) {
        this.articleCategoryService = articleCategoryService;
    }

    //    @Autowired(required = true)
//    @Qualifier(value = "customService")
//    public void setCustomService(CustomService customService){
//        this.customService = customService;
//    }

    @RequestMapping(value = "/articles",method = RequestMethod.GET,produces = "application/json")
    public  List<Article> listArticles(){
        return this.articleService.getArticles();
    }



    @RequestMapping(value = "article/add",method = RequestMethod.POST)
    public String addArticle(@RequestBody CustomDTO customDTO){
        Article article = new Article();
        article.setHeading(customDTO.getHeading());
        article.setDescription(customDTO.getDescription());
        article.setCreationTime(customDTO.getCreationTime());
        this.articleService.addArticle(article);
//        this.customService.addArticleDetails(customDTO);
        System.out.println("CustomDTO data:\n"+customDTO);
        return "OK";
    }

    @RequestMapping(value = "article/addcustom",method = RequestMethod.POST)
    public String addCustomDTO(@RequestBody CustomDTO customDTO){
//        Article article = new Article();
//        article.setHeading(customDTO.getHeading());
//        article.setDescription(customDTO.getDescription());
//        article.setCreationTime(customDTO.getCreationTime());
        List<String> categories = customDTO.getCategory();
//        Long articleId = this.articleService.addArticle(article);
        System.out.println("CustomDTO data:\n"+customDTO);
        this.articleCategoryService.addArticleCategories(customDTO.getArticleId(),categories);
        System.out.println("CustomDTO data:\n"+customDTO);
        return "OK";
    }

}
