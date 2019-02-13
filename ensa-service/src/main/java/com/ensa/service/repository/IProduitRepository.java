package com.ensa.service.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.module.entities.Produit;

@Repository
public interface IProduitRepository extends JpaRepository<Produit, Long>{

}
