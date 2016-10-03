package com.starter.architecture.controllers;

import com.starter.architecture.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoteController {

    final private NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @RequestMapping("/notes")
    public String index(Model model) {
        model.addAttribute("notes", noteService.getAll());
        return "note_index";
    }

}
