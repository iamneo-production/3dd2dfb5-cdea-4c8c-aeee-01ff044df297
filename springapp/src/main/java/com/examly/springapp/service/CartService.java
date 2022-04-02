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

    public CartModel addToCart(CartModel cart) {
        return cartRepository.save(cart);
	}

    public List<CartModel> getCarts(String id){
		return cartRepository.findByUserId(id);
	}

    public void deleteById(String id) {
		cartRepository.deleteById(id);
	}

}