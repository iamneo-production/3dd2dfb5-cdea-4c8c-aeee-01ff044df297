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

    public CartModel saveCart(CartModel cart) {
		return cartRepository.save(cart);
	}

    public List<CartModel> getCarts(){
		return cartRepository.findAll();
	}

    public void deleteById(int id) {
		cartRepository.deleteById(id);
	}

}