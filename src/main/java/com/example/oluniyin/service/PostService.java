package com.example.oluniyin.service;

import org.springframework.stereotype.Service;

import com.example.oluniyin.domain.Post;
import com.example.oluniyin.repository.PostRepository;

/**
 * 
 * @author gyebadokpo.ext
 *
 */
@Service
public class PostService {

	private PostRepository postRepository;

	public PostService(PostRepository postRepository) {
		
		this.postRepository = postRepository;
	}
	
	public Post getLatestPost(){
		return postRepository.findFirstByOrderByPostedOnDesc();
	}

}
