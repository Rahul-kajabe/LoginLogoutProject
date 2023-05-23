package com.mini.rahul.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mini.rahul.entity.Role;
@Repository
public interface RoleRepo extends JpaRepository<Role, Long>{
	
	  public Role findByName(String name);
	
	

}
