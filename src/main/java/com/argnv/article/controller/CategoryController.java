package com.argnv.article.controller;

import com.argnv.article.Models.Category;
import com.argnv.article.Services.ArticleService;
import com.argnv.article.Services.CategoryService;
import com.argnv.article.dto.CustomDTO;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by root on 4/26/17.
 */
@RestController
public class CategoryController {

    private CategoryService categoryService;


    @Autowired(required = true)
    @Qualifier(value = "categoryService")
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = "categories/add",method = RequestMethod.POST)
    public String addCategory(@RequestBody Category category){
        this.categoryService.addCategory(category);
        return "Category Added to DB";
    }

    @RequestMapping(value = "categories",method = RequestMethod.GET,produces = "application/json")
    public List<Category> getCategories(){
        List<Category> categories = this.categoryService.getCategories();
        System.out.println(categories);
        return categories;
    }

}
