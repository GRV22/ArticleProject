package com.argnv.article.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by ganesh on 8/3/17.
 */
@RestController
public class MappingController {

    @RequestMapping(value = "/articles",method = RequestMethod.GET,headers = "Accept=application/json")//,produces = "application/json")
    public String getArticles(@RequestParam(value = "category",required = false)String category,
                              @RequestParam(value = "articleIds",required = false)List<String> articleIds,
                              @RequestParam(value = "from",required = false)Date formDate,
                              @RequestParam(value = "to",required = false)Date ToDate,
                              @RequestParam(value = "offset",required = false)Integer offset,
                              @RequestParam(value = "limit",required = false)Integer limit){
            // Business logic to get data from DB
        return "{ \"user\" : \"kalakriti\" }";
    }

    @RequestMapping(value = "/articles/{articleId}",method = RequestMethod.GET,headers = "Accept=application/json")//,produces = "application/json")
    public String getAnArticle(@PathVariable("articleId")String articleId){
        //Business Logic to get data from DB
        return "{ \"userId\" : "+articleId+" }";
    }

}
