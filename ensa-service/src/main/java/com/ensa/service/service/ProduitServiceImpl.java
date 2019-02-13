package com.ensa.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ensa.module.entities.Produit;
import com.ensa.service.repository.IProduitRepository;

@Service
public class ProduitServiceImpl implements IProduitService{

	@Autowired
	private IProduitRepository produitRepository;
	
	@Override
	public List<Produit> getProduits() {
		return produitRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		produitRepository.save(produit);		
	}

	@Override
	public void updateProduit(Produit produit) {
		produitRepository.save(produit);		
	}

	@Override
	public void deleteProduit(long id) {
		Produit produit=produitRepository.getOne(id);
		produitRepository.delete(produit);
	}

}
