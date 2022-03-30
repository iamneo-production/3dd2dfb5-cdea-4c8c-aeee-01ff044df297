package com.examly.springapp.controller;

import com.examly.springapp.model.CartModel;
import com.examly.springapp.service.CartService;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class CartController {

    @Autowired
    private CartService cartService;
    private CartModel cartModel;

    @RequestMapping(method=RequestMethod.POST, value="/home/{id}")
    public CartModel addToCart(@RequestBody CartModel cartModel,@PathVariable String id){
        return cartService.addToCart(cartModel,id);
    } 

    @RequestMapping(method=RequestMethod.GET, value="/cart/{id}")
    public List<CartModel> showCart(@PathVariable String id){
        return cartService.getCart(id);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/cart/delete/{id}")
    public void deleteCartItem(@PathVariable String id) {
        cartService.deleteCartItem(id);
        
    }




}
