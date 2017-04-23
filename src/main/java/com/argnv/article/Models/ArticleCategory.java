package com.argnv.article.Models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by root on 4/11/17.
 */
@Entity
@Table(name = "POST_CATEGORY")
public class ArticleCategory implements Serializable {

    @EmbeddedId
    private ArticleCategoryKey key;

    public ArticleCategoryKey getKey() {
        return key;
    }

    public void setKey(ArticleCategoryKey key) {
        this.key = key;
    }
}
