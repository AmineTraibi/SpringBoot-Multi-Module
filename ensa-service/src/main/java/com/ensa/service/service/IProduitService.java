package com.ensa.service.service;

import java.util.List;

import com.ensa.module.entities.Produit;

public interface IProduitService {

	List<Produit> getProduits();

	void addProduit(Produit produit);

	void updateProduit(Produit produit);

	void deleteProduit(long id);
	
}
