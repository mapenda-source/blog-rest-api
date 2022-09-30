package com.mapenda.dev.blogrestapi.service;

import com.mapenda.dev.blogrestapi.dto.PostDto;
import com.mapenda.dev.blogrestapi.dto.PostResponse;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}