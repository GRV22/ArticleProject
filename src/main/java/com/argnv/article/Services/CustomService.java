package com.argnv.article.Services;

import com.argnv.article.dto.CustomDTO;

import java.util.List;

/**
 * Created by root on 4/11/17.
 */
public interface CustomService {

    public void addArticleDetails(CustomDTO customDTO);
    public List<CustomDTO> getArticleDetails();

}
