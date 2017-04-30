package com.argnv.article.dto;

import com.argnv.article.Models.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 4/10/17.
 */
public class CustomDTO {


    Long articleId;
    String description;
    String heading;
    Long creationTime;
    List<Category> categories = new ArrayList<Category>();
    List<String> category=new ArrayList<String>();


    public CustomDTO(){

    }

    public CustomDTO(Long articleId,String description,String heading,List<String> category){
        this.articleId = articleId;
        this.description = description;
        this.heading = heading;
        this.category = category;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("articleId : ").append(this.getArticleId()).append("\n")
                .append("heading : ").append(this.getHeading()).append("\n")
                .append("description : ").append(this.getDescription()).append("\n")
                .append("categories : ").append(this.getCategory());
        return builder.toString();
    }



}
