package com.mapenda.dev.blogrestapi.repository;

import com.mapenda.dev.blogrestapi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
