package com.examly.springapp.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.CartModel;
import com.examly.springapp.repository.CartRepository;
import com.examly.springapp.controller.CartController;

@Service
public class CartService {
    @Autowired
	private CartRepository cartRepository;

    public CartModel saveCart(int Quantity, int id) {
		ProductModel product = productService.getProductById(id);
        if(product == null) {
            return null;
        }

        CartModel cartItem = new CartModel();
        cartItem.setProductName(product.getProductName());
        cartItem.setQuantity(quantity);
        cartItem.setPrice(quantity * product.getPrice());
        cartItem.setUserId(2L);

        return cartRepository.save(cartItem);
	}

    public List<CartModel> getCarts(int id){
		return cartRepository.findByUserId(id);
	}

    public void deleteById(int id) {
		cartRepository.deleteById(id);
	}

}