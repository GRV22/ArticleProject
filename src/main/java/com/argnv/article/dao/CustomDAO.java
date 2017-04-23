package com.argnv.article.dao;

import com.argnv.article.Models.Article;
import com.argnv.article.dto.CustomDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by root on 4/10/17.
 */
public class CustomDAO extends JdbcDaoSupport {

    String customQuery = "";

    RowMapper customMapper = new RowMapper<CustomDTO>() {
        public CustomDTO mapRow(ResultSet resultSet, int i) throws SQLException {
            String heading = resultSet.getString("heading");
            String description = resultSet.getString("description");
            Long articleId = resultSet.getLong("articleId");
            List<String> category = (List<String>) resultSet.getArray("category");
            return new CustomDTO(articleId,description,heading,category);
        }
    };

    private ArticleDAO articleDAO;
    public void setArticleDAO(ArticleDAO articleDAO){
        this.articleDAO = articleDAO;
    }

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public void addArticleDetails(CustomDTO customDTO){
        Session session = this.sessionFactory.getCurrentSession();

        Article article = new Article();
        article.setCreationTime(customDTO.getCreationTime());
        article.setDescription(customDTO.getDescription());
        article.setHeading(customDTO.getHeading());

        this.articleDAO.saveArticle(article);

    }

}
