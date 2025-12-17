package com.example.bbsDemo.dto;

import java.util.List;

public record PageResponse<T>(
    List<T> content,
    int page,          // 0-base
    int size,
    long totalElements,
    int totalPages
) {}
