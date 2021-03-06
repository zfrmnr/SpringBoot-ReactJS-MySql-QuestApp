package com.zfrmnr.questapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zfrmnr.questapp.entities.Post;
import com.zfrmnr.questapp.repos.PostRepository;

@Service
public class PostService {
	
	private PostRepository postRepository;

	public PostService(PostRepository postRepository) {
		
		this.postRepository = postRepository;
	}

	public List<Post> getAllPosts(Optional<Long> userId) {
		if(userId.isPresent())
			return postRepository.findByUserId(userId.get());
		return postRepository.findAll();
	}

	public Post getOnePostById(Long postId) {
		return postRepository.findById(postId).orElse(null);
	}

	public Post createOnePostById(Post newPost) {
	return postRepository.save(newPost);
	}

}
