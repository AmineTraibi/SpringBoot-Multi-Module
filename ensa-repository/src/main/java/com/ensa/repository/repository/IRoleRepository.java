package com.ensa.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.module.entities.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long>{
	
	Role findByName(String name);
}
