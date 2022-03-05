package com.zfrmnr.questapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zfrmnr.questapp.entities.Like;

public interface LikeRepository extends JpaRepository<Like,Long> {

}
