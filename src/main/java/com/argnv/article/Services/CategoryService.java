package com.argnv.article.Services;

import com.argnv.article.Models.Category;

import java.util.List;

/**
 * Created by root on 4/26/17.
 */
public interface CategoryService {

    public void addCategory(Category category);
    public Category getCategory(String categoryId);
    public List<Category> getCategories();
    public void removeCategory(String categoryId);

}
