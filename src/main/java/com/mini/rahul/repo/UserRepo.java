package com.mini.rahul.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mini.rahul.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
	
	public User findByEmail(String email);

}
