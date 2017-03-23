package com.argnv.article.controller;

import com.argnv.article.Models.Article;
import com.argnv.article.Services.ArticleService;
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

    @Autowired(required = true)
    @Qualifier(value = "articleService")
    public void setArticleService(ArticleService articleService){
        this.articleService = articleService;
    }


    @RequestMapping(value = "/articles",method = RequestMethod.GET,produces = "application/json")
    public  List<Article> listArticles(){
        return this.articleService.getArticles();
    }

    @RequestMapping(value = "article/add",method = RequestMethod.POST)
    public String addArticle(@ModelAttribute("article") Article article){
        if(article.getArticleId()==0) {
            this.articleService.addArticle(article);
        }
        return "redirect:/article";
    }

}
