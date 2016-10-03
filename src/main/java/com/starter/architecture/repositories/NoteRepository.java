package com.starter.architecture.repositories;

import com.starter.architecture.domain.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note,Integer> {
}
