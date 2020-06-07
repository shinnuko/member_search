package com.example.demo.controller;

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
 * BbsController
 */
@Controller
@RequestMapping("/bbs")

public class BbsController {
    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexGet(ModelMap modelMap) {
        List<CommentDto> commentList = commentRepository.findAll();
        modelMap.addAttribute("commentList", commentList);
        return "bbs/index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String indexPost(ModelMap modelMap, @RequestParam("content") String content, @RequestParam("href_url") String href_url,@RequestParam("posted_user_id") Integer posted_user_id) {
        CommentDto comment = new CommentDto();
        comment.setContent(content);
        comment.setHref_url(href_url);
        comment.setPosted_user_id(posted_user_id);
        commentRepository.save(comment);
        return indexGet(modelMap);
    }

}