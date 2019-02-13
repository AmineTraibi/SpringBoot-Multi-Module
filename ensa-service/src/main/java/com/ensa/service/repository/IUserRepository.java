package com.ensa.service.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.module.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{
    //jpa-data offre cette possibilité
	//jpa cree un obljet par defaut apres il commence de set() **constructeur par defaut
	User findByUsername(String str);
}