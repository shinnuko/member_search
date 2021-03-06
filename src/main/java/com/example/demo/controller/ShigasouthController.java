package com.example.demo.controller;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.CommentRepository;
import com.example.demo.dto.CommentDto;
/**
 * ShigasouthController
 */
@Controller
@RequestMapping("/")
public class ShigasouthController {
	
	
    @Autowired
    private CommentRepository commentRepository;
    @RequestMapping(value = "/shigasouth", method = RequestMethod.GET)
    public String indexGet(ModelMap modelMap) {
        List<CommentDto> commentList = commentRepository.findAll();
        modelMap.addAttribute("commentList", commentList);
        return "shigasouth";
    }
    
    @RequestMapping(value = "/shigasouth", method = RequestMethod.POST)
    public String indexPost(ModelMap modelMap, @RequestParam("content") String content, @RequestParam("href_url") String href_url) {
        CommentDto comment = new CommentDto();
        Date posted_at = new Date();
         
		System.out.println(posted_at);
        comment.setContent(content);
        comment.setHref_url(href_url);
        comment.setPosted_at(posted_at);
        commentRepository.save(comment);
        return indexGet(modelMap);
    }

}