package com.ensa.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.module.entities.Produit;
import com.ensa.service.service.IProduitService;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {

	@Autowired
	private IProduitService produitservice;

	@GetMapping
	public List<Produit> getProduits1() {
		return produitservice.getProduits1();
	}
	
	@GetMapping("/getprds/{page}/{size}")
	public Page<Produit> getProduits(@PathVariable int page,@PathVariable int size) {
		return produitservice.getProduits(page,size);
	}


	@PostMapping("/add")
	public void addProduit(@RequestBody Produit produit) {
		produitservice.addProduit(produit);
	}

	@PutMapping("/update")
	public void updateProduit(@RequestBody Produit produit) {
		produitservice.updateProduit(produit);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteProduit(@PathVariable long id) {
		produitservice.deleteProduit(id);
	}

}
