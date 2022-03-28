package com.examly.springapp.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.ProductModel;
import com.examly.springapp.repository.ProductRepository;
import com.examly.springapp.controller.ProductController;

@Service
public class ProductService {
    @Autowired
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository=productRepository;
	}
	
	public ProductModel saveProduct(ProductModel product) {
		return productRepository.save(product);
	}
	
	// public List<ProductModel> saveProducts(List<ProductModel> products){
	// 	return productRepository.saveAll(products);
	// }
	
	public List<ProductModel> getProducts(){
		return productRepository.findAll();
	}
	
	public ProductModel getProductById(int id){
		return productRepository.findById(id).orElse(null);
	}
	
	public void deleteById(int id) {
		productRepository.deleteById(id);
	}
	
	public ProductModel updateProduct(int id, ProductModel productModel) {
		ProductModel existingProduct = productRepository.findById(id).orElse(null);
		existingProduct.setProductId(productModel.getProductId());	
		existingProduct.setImageUrl(productModel.getImageUrl());
		existingProduct.setProductName(productModel.getProductName());
		existingProduct.setPrice(productModel.getPrice());
		existingProduct.setDescription(productModel.getDescription());
		existingProduct.setQuantity(productModel.getQuantity());
		return productRepository.save(existingProduct);
	}
    
}