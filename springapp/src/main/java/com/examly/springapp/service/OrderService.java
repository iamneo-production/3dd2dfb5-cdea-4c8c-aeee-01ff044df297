package com.examly.springapp.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.OrderModel;
import com.examly.springapp.repository.OrderRepository;
import com.examly.springapp.controller.OrderController;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderrepository;

    public List<OrderModel> getUserProducts(String id){ 
        return orderrepository.findByUserId(id);

    }    

    public void saveProduct(String id){

    }

    public void placeOrder(OrderModel order){

    }

    public List<OrderModel> getAllUsersOrders(){
        return orderrepository.findAll();
    }
    
}
