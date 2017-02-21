package com.onblur7.repository;

import com.onblur7.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends Repository<User,String> {

    Page<User> findAll(Pageable pageable);

    User save(User user);

    User findUserById(String id);

    void deleteUserById(String id);
}
