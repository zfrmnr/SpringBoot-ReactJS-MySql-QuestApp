package com.zfrmnr.questapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zfrmnr.questapp.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long>{

}
