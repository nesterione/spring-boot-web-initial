package com.starter.architecture.services;

import com.starter.architecture.domain.Tag;
import com.starter.architecture.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

    @Autowired
    private TagRepository repository;

    public List<Tag> all() {
        throw new RuntimeException("error");
       // return (List<Tag>)repository.findAll();
    }

}
