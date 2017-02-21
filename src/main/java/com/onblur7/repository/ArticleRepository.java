package com.onblur7.repository;

import com.onblur7.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface ArticleRepository extends CrudRepository<Article,Integer> {

    Page<Article> findAll(Pageable pageable);
}
