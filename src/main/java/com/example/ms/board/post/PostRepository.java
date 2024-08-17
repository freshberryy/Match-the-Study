package com.example.ms.board.post;


import org.hibernate.Internal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
