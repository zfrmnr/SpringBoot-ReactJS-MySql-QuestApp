package com.zfrmnr.questapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zfrmnr.questapp.entities.Post;

public interface PostRepository extends JpaRepository<Post,Long>{

}
