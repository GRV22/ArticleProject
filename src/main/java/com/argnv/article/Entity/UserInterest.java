package com.argnv.article.Entity;

import javax.persistence.*;

/**
 * Created by root on 3/15/17.
 */
@Entity
@Table(name = "USER_INTEREST")
public class UserInterest {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id",columnDefinition = "bigint(20) not null")
    private Long userId;

    @Column(name = "category_id",columnDefinition = "bigint(20) not null")
    private Long categoryId;

    @Column(name = "creation_time", columnDefinition = "bigint(20) unsigned not null")
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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }
}
