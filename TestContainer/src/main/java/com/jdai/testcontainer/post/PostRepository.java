package com.jdai.testcontainer.post;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;


public interface  PostRepository extends ListCrudRepository<Post, Integer> {
    Optional<Post> findByTitle(String title);

}
