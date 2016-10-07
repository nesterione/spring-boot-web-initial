package com.starter.architecture.repositories;

import com.starter.architecture.domain.Note;
import org.aspectj.weaver.ast.Not;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NoteRepository extends CrudRepository<Note,Long> {

    List<Note> findByTitle(String title);
}
