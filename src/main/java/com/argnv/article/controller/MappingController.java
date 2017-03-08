package com.argnv.article.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Created by ganesh on 8/3/17.
 */
@Controller
public class MappingController {
    @RequestMapping(value = "/articles",method = RequestMethod.GET)
    public String getArticles(@RequestParam(value = "category",required = false)String category,
                              @RequestParam(value = "dateField",required = false)Date date){
            // Business logic to get articles from DB
        return null;
    }
}
