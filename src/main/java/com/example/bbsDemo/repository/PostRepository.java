package com.example.bbsDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bbsDemo.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
    
}
