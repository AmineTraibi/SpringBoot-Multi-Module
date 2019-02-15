package com.ensa.service.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ensa.module.entities.Produit;

public interface IProduitService {

	Page<Produit> getProduits(int page,int size);
	
	List<Produit> getProduits1();

	void addProduit(Produit produit);

	void updateProduit(Produit produit);

	void deleteProduit(long id);
	
}
