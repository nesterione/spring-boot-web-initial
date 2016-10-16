package com.starter.architecture.controllers;

import com.starter.architecture.domain.Note;
import com.starter.architecture.services.NoteService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/notes")
public class NoteRestController {

    private final static Logger log = Logger.getLogger(NoteRestController.class);

    @Autowired
    private NoteService service;

    @GetMapping
    public List<Note> all() {

        log.info("get all data");

        return service.getAll();
    }

    @PutMapping
    public Note put(@RequestBody Note note) {
        return service.save(note);
    }
}
