package com.starter.architecture.controllers;

import com.starter.architecture.domain.Tag;
import com.starter.architecture.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService service;

    @ResponseStatus( reason="Data not found")
    @ExceptionHandler(RuntimeException.class)
    public String error() {
        return "error_view";
    }

    @RequestMapping("/all")
    public String all(Model model) {
        List<Tag> tags = service.all();
        model.addAttribute("tags", tags);
        return "tag_view";
    }


    @RequestMapping("/wel")
    public String wel(Model model) {
        return "wel";
    }
}
