package com.argnv.article.Models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by root on 3/15/17.
 */
@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long categoryId;

    @Column(name = "category_name",columnDefinition = "varchar(100) not null")
    private String categoryName;

    @Column(name = "category_pic_url",columnDefinition = "text not null")
    private String categoryPicUrl;

    @Column(name = "is_active",columnDefinition = "boolean default true")
    private Boolean isActive;

    @Column(name = "creation_time", columnDefinition = "bigint(20) unsigned not null")
    private Long creationTime;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryPicUrl() {
        return categoryPicUrl;
    }

    public void setCategoryPicUrl(String categoryPicUrl) {
        this.categoryPicUrl = categoryPicUrl;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }
}
