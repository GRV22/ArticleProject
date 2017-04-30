package com.argnv.article.dao;

import com.argnv.article.Models.Category;

import java.util.List;

/**
 * Created by root on 4/26/17.
 */
public interface CategoryDAO {

    public void addCategory(Category category);
    public Category getCategory(String categoryId);
    public void removeCategory(String categoryId);
    public List<Category> getCategories();
}
