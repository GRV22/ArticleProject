package com.argnv.article.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by root on 3/15/17.
 */
@Entity
@Table(name = "category")
public class Category implements Serializable{

    @Id
    @Column(name = "categoryId",columnDefinition = "varchar(100) not null")
    private String categoryId;

    @Column(name = "categoryPicurl",columnDefinition = "text not null")
    private String categoryPicUrl;

    @Column(name = "isActive",columnDefinition = "boolean default 1")
    private Boolean isActive = Boolean.TRUE;

    @Column(name = "creationTime", columnDefinition = "bigint(20) unsigned not null")
    private Long creationTime;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "category",orphanRemoval = true, cascade= CascadeType.ALL)
    Set<ArticleCategory> articleCategories;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }


    public String getCategoryPicUrl() {
        return categoryPicUrl;
    }

    public void setCategoryPicUrl(String categoryPicUrl) {
        this.categoryPicUrl = categoryPicUrl;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public Set<ArticleCategory> getArticleCategories() {
        return articleCategories;
    }

    public void setArticleCategorys(Set<ArticleCategory> articleCategories) {
        this.articleCategories = articleCategories;
    }
}
