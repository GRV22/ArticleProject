package com.argnv.article.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.security.Provider;

/**
 * Created by root on 4/11/17.
 */
@Entity
@Table(name = "article_category")
public class ArticleCategory implements Serializable {

    @EmbeddedId
    private ArticleCategoryKey key;


    @MapsId("article")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "articleId")
    private Article article;

    @MapsId("category")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryId")
    private Category category;



    public ArticleCategoryKey getKey() {
        return key;
    }

    public void setKey(ArticleCategoryKey key) {
        this.key = key;
    }
}
