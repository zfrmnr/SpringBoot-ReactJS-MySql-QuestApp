package com.zfrmnr.questapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zfrmnr.questapp.entities.Post;
import com.zfrmnr.questapp.services.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {
	private PostService postService;

	public PostController(PostService postService) {
		this.postService = postService;
	}
	
	@GetMapping
	public List<Post> getAllPosts(@RequestParam Optional<Long> userId){
		return postService.getAllPosts(userId);
	}
	
	@PostMapping
	public Post createOnePost(@RequestBody Post newPost) {
		return postService.createOnePostById(newPost);
	}
	
	
	@GetMapping("/{postId}")
	public Post getOnePost(@PathVariable Long postId) {
		return postService.getOnePostById(postId);
	}
	
	
	
	
}
