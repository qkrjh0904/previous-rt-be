package com.complete.rt.domain.post.repository;

import com.complete.rt.db.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
