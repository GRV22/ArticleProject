package com.argnv.article.Models;

import javax.persistence.*;

/**
 * Created by root on 3/15/17.
 */
@Entity
@Table(name = "user_interest")
public class UserInterest {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "userId",columnDefinition = "bigint(20) not null")
    private Long userId;

    @Column(name = "categoryId",columnDefinition = "varchar(100) not null")
    private String categoryId;

    @Column(name = "creationTime", columnDefinition = "bigint(20) unsigned not null")
    private Long creationTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }
}
