package com.argnv.article.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by root on 3/15/17.
 */
@Entity
@Table(name = "article")
public class Article implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "articleId")
    private Long articleId;

    @Column(columnDefinition = "text not null")
    private String heading;

    @Column(name = "description",columnDefinition = "text not null")
    private String description;

    @Column(name = "isActive",columnDefinition = "boolean default true")
    private boolean isActive;

    @Column(name = "creationTime", columnDefinition = "bigint(20) unsigned not null")
    private Long creationTime;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "article",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ArticleCategory> articleCategories;


    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }


    public List<ArticleCategory> getArticleCategories() {
        return articleCategories;
    }

    public void setArticleCategories(List<ArticleCategory> articleCategories) {
        this.articleCategories = articleCategories;
    }
}
