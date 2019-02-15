package com.ensa.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ensa.module.entities.Produit;
import com.ensa.repository.repository.IProduitRepository;

@Service
public class ProduitServiceImpl implements IProduitService{

	@Autowired
	private IProduitRepository produitRepository;
	
	@Override
	public Page<Produit> getProduits(int page,int size) {
		 return produitRepository.findAll(PageRequest.of(page, size));
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

	@Override
	public List<Produit> getProduits1() {
		return produitRepository.findAll();
	}

}
