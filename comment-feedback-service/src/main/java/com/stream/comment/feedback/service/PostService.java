package com.stream.comment.feedback.service;


import com.stream.comment.feedback.dto.PostRequest;
import com.stream.comment.feedback.dto.PostResponse;


public interface PostService {
	
	PostResponse create(PostRequest postDto);
    //Page<PostRequest> getPostsByUserId(Long userId, Pageable pageable);
    //PostRequest getPostById(Long postId);
    //PostRequest update(PostRequest postDto);
    //PostRequest delete(Long postId);

}
