package com.example.bbsDemo.data;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

import org.springframework.boot.CommandLineRunner;

import com.example.bbsDemo.entity.Post;
import com.example.bbsDemo.repository.PostRepository;

public class PostSeeder implements CommandLineRunner{
    private final PostRepository postRepository;

    @Override
    public void run(String... args) {
        if (postRepository.count() > 0) return;

        var now = LocalDateTime.now();
        var posts = IntStream.rangeClosed(1, 105)
            .mapToObj(i -> Post.builder()
            .title("더미 게시물 " + i)
            .author("user" + ((i % 7) + 1))
            .createdAt(now.minusDays(105 - i))
            .views((i * 13) % 1000)
            .build()
        )
        .toList();

    postRepository.saveAll(posts);
  }    
}
