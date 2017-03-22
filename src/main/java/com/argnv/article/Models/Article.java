package com.argnv.article.Models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by root on 3/15/17.
 */
@Entity
@Table(name = "POST")
public class Article implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long articleId;

    @Column(name = "category_id",columnDefinition = "bigint(20) not null")
    private Long categoryId;

    @Column(columnDefinition = "text not null")
    private String heading;

    @Column(name = "desc",columnDefinition = "text not null")
    private String description;

    @Column(name = "is_active",columnDefinition = "boolean default true")
    private boolean isActive;

    @Column(name = "creation_time", columnDefinition = "bigint(20) unsigned not null")
    private Long creationTime;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }
}
