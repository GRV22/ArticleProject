package com.argnv.article.Models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by root on 4/22/17.
 */
@Embeddable
public class ArticleCategoryKey implements Serializable{
    @Column(name = "category_id")
    private Long categeryId;

    @Column(name = "post_id")
    private Long articleId;


    public Long getCategeryId() {
        return categeryId;
    }

    public void setCategeryId(Long categeryId) {
        this.categeryId = categeryId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }


    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((categeryId == null) ? 0 : categeryId.hashCode());
        result = prime * result + articleId.hashCode();
        return result;
    }


    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ArticleCategoryKey other = (ArticleCategoryKey) obj;
//        if (categeryId == null) {
//            if (other.categeryId != null)
//                return false;
//        } else if (!categeryId.equals(other.categeryId))
        if (categeryId!=(other.categeryId))
            return false;
        if (articleId != other.articleId)
            return false;
        return true;
    }

}
