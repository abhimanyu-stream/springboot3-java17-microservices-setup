package com.stream.comment.feedback.service;

import java.util.ArrayList;
import java.util.List;


import com.stream.comment.feedback.dto.PostRequest;
import com.stream.comment.feedback.dto.PostResponse;
import com.stream.comment.feedback.model.Post;
import com.stream.comment.feedback.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PostServiceImpl implements PostService {
	
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public PostResponse create(PostRequest postRequest) {
		//Post post = Post.builder().title(postRequest.getTitle()).body(postRequest.getBody()).path(postRequest.getPath()).createdBy(postRequest.getCreatedBy()).build();
		
		Post post = new Post(postRequest.getTitle(),postRequest.getBody(),postRequest.getPath());
		post = postRepository.save(post);
		List<Post> postList = new ArrayList<>();
		postList.add(post);
		PostResponse postResponse = new PostResponse(postList);
		return postResponse;

	}

	/*@Override
	public PostRequest delete(Long postId) {
		
		// soft delete implementation
		*//*
		 * Optional<Post> optPost = postRepository.findByIdAndDeletedIsFalse(postId);
		 * if (optPost.isEmpty()) { throw new
		 * ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found"); } Post post
		 * = optPost.get(); post.setDeleted(true); post = postRepository.save(post);
		 *//*
		// Hard delete Implementation
		Optional<Post> postFound = postRepository.findById(postId);
		Post post = postFound.get();
		if(postFound.get() != null) {
			postRepository.deleteById(postId);
			System.out.println("Post whose id is ${postId}" + " deleted successfully");
		}
		
		return PostRequest.builder().title(post.getTitle()).postId(post.getId()).body(post.getBody()).path(post.getPath())

				.build();
	}*/
}
