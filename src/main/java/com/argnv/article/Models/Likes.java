package com.argnv.article.Models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by root on 3/15/17.
 */
@Entity
@Table(name = "likes")
public class Likes implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long likeId;

    @Column(name = "userId",columnDefinition = "bigint(20) unsigned not null")
    private Long userId;

    @Column(name = "articleId",columnDefinition = "bigint(20) unsigned not null")
    private Long articleId;

    @Column(name = "creationTime", columnDefinition = "bigint(20) unsigned not null")
    private Long creationTime;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public Long getLikeId() {
        return likeId;
    }

    public void setLikeId(Long likeId) {
        this.likeId = likeId;
    }
}
