package com.onblur7.repository;

import com.onblur7.model.Tag;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface TagRepository extends CrudRepository<Tag,Integer> {

}
