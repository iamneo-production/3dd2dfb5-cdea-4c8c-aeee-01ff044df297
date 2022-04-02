package com.examly.springapp.service;

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
		ProductModel addingProduct = productRepository.save(product);
		return addingProduct;
	}
	
	// public List<ProductModel> saveProducts(List<ProductModel> products){
	// 	return productRepository.saveAll(products);
	// }
	
	public List<ProductModel> getProducts(){
		List<ProductModel> products = new ArrayList<>();
		productRepository.findAll().forEach(products :: add);
		return products;
	}
	
	public ProductModel getProductById(String id){
		return productRepository.findById(id).orElse(null);
	}
	
	public void deleteById(String id) {
		productRepository.deleteById(id);
	}
	
	public ProductModel productSaveEdit(ProductModel product,String id) {
		return productRepository.save(product);
	}
    
}
