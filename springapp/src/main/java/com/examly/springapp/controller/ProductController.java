package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.ProductModel;
import com.examly.springapp.repository.ProductRepository;
import com.examly.springapp.services.ProductService;


@RestController
@RequestMapping
public class ProductController {
    @Autowired
	private ProductService productService;
	
	@PostMapping("/admin/addProduct")
	public ProductModel addProducts(@RequestBody ProductModel product){
		return productService.saveProduct(product);
	}
	
	@GetMapping("/admin/productEdit/{id}")
	public ProductModel getProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}
	
	@GetMapping("/home")
	public List<ProductModel> findAllProductsHome() {
		return productService.getProducts();
	}

	@GetMapping("/admin")
    public List<ProductModel> findAllProductsAdmin(){
        return productService.getProducts();
    }
	
	@DeleteMapping("/admin/delete/{id}")
	public String deleteProductById(@PathVariable int id) {
		productService.deleteById(id);
		return "Deleted";
	}
	
	@PutMapping("/admin/productEdit/{id}")
	public ProductModel updateProduct(@PathVariable int id, @RequestBody ProductModel product) {
		return productService.updateProduct(id,product);
	}
}