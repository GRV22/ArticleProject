package com.argnv.article.controller;

import com.argnv.article.Models.Article;
import com.argnv.article.Services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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


    @RequestMapping(value = "/article",method = RequestMethod.GET)
    public String listArticles(Model model){
        model.addAttribute("article",new Article());
        model.addAttribute("listArticles",this.articleService.getArticles());
        List<Article> articles = this.articleService.getArticles();
        for (Article article:
             articles) {
            System.out.println(article.getArticleId()+"<=>"+article.getCategoryId()+"<=>"+article.getHeading());
        }
        return model.toString();//"article";
    }

    @RequestMapping(value = "article/add",method = RequestMethod.POST)
    public String addArticle(@ModelAttribute("article") Article article){
        if(article.getArticleId()==0) {
            this.articleService.addArticle(article);
        }
        return "redirect:/article";
    }

}
