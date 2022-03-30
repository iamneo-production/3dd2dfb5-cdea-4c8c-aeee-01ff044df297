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
    private CartModel cartModel;

    public CartModel addToCart(CartModel cartModel, String id){
        cartModel.setCartItemID(id);
        return cartRepository.save(cartModel);
    }

    public List<CartModel> getCart(String id){
        List<CartModel> cart = new ArrayList<>();
        cart.add(cartRepository.findById(id).orElse(null));
        return cart;
    }

    public void deleteCartItem(String id){
        cartRepository.deleteById(id);
    }


}
