package com.zfrmnr.questapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zfrmnr.questapp.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
