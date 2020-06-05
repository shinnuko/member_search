package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.CommentRepository;
 
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
        List<Comment> commentList = commentRepository.findAll();
        modelMap.addAttribute("commentList", commentList);
        return "bbs/index";
    }
 
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String indexPost(ModelMap modelMap, @RequestParam("name") String name, @RequestParam("text") String text) {
        Comment comment = new Comment();
        comment.setName(name);
        comment.setText(text);
        commentRepository.save(comment);
        return indexGet(modelMap);
    }
 
}