package com.example.produit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.produit.entities.Produit;
import com.example.produit.repos.ProduitRepository;

@Service
public class ProduitServiceempl implements ProduitService {
    @Autowired
	ProduitRepository produitRepository;
	
    @Override
    public Produit saveProduit(Produit p) {
    	return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
    return produitRepository.save(p);
    }
    @Override
    public void deleteProduit(Produit p) {
    produitRepository.delete(p);
    }
     @Override
    public void deleteProduitById(Long id) {
    produitRepository.deleteById(id);
    }
    @Override
    public Produit getProduit(Long id) {
    return produitRepository.findById(id).get();
    }
    @Override
    public List<Produit> getAllProduits() {
    return produitRepository.findAll();

} }
