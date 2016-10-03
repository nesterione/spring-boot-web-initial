package com.starter.architecture.repositories;

import com.starter.architecture.domain.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {
}