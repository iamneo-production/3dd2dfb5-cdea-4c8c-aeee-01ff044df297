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

import com.examly.springapp.model.CartModel;
import com.examly.springapp.repository.CartRepository;
import com.examly.springapp.service.CartService;

@RestController
@RequestMapping
public class CartController{
    @Autowired
    private CartService cartService;

    @PostMapping("/home/{id}")
    public CartModel addCarts(@RequestBody CartModel cart){
		return cartService.saveCart(cart);
	}

    @GetMapping("/cart/{id}")
	public List<CartModel> getAllCartItems() {
		return cartService.getCarts();
	}

    @DeleteMapping("/cart/{id}")
	public String deleteCartById(@PathVariable int id) {
		cartService.deleteById(id);
		return "CartDeleted";
	}

}
