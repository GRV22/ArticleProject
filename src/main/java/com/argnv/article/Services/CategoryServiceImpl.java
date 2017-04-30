package com.argnv.article.Services;

import com.argnv.article.Models.Category;
import com.argnv.article.dao.CategoryDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by root on 4/26/17.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryDAO categoryDAO;

    public void setCategoryDAO(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @Transactional
    public void addCategory(Category category) {
        this.categoryDAO.addCategory(category);
    }

    @Transactional
    public Category getCategory(String categoryId) {
        return this.categoryDAO.getCategory(categoryId);
    }

    @Transactional
    public List<Category> getCategories() {
        return this.categoryDAO.getCategories();
    }

    @Transactional
    public void removeCategory(String categoryId) {
        this.categoryDAO.removeCategory(categoryId);
    }
}
