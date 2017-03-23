package com.argnv.article.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by root on 3/15/17.
 */
@Entity
@Table(name = "LIKES")
public class Likes implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long commentId;

    @Column(name = "user_id",columnDefinition = "bigint(20) unsigned not null")
    private Long userId;

    @Column(name = "post_id",columnDefinition = "bigint(20) unsigned not null")
    private Long articleId;

    @Column(name = "creation_time", columnDefinition = "bigint(20) unsigned not null")
    private Long creationTime;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

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
}
