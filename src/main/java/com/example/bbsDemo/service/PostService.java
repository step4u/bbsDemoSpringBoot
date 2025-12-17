package com.example.bbsDemo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.bbsDemo.dto.PageResponse;
import com.example.bbsDemo.dto.PostDto;
import com.example.bbsDemo.entity.Post;
import com.example.bbsDemo.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

  public PageResponse<PostDto> getPosts(int page, int size) {
    PageRequest pr = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "id"));
    Page<Post> result = postRepository.findAll(pr);

    var content = result.getContent().stream()
        .map(p -> new PostDto(p.getId(), p.getTitle(), p.getAuthor(), p.getCreatedAt(), p.getViews()))
        .toList();

    return new PageResponse<>(
        content,
        result.getNumber(),
        result.getSize(),
        result.getTotalElements(),
        result.getTotalPages()
    );
  }
}
