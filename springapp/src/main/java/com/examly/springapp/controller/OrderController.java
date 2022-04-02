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

import com.examly.springapp.model.OrderModel;
import com.examly.springapp.repository.OrderRepository;
import com.examly.springapp.service.OrderService;

@RestController
@RequestMapping
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<OrderModel> getUserProducts(@PathVariable String id){
        return orderService.getUserProducts(id);
    } 

    @PostMapping("/saveOrder")
    public void saveProduct(@PathVariable String id){
        orderService.saveProduct(id);
    }

    @PostMapping("/placeOrder")
    public void placeOrder(@RequestBody OrderModel order){
        orderService.placeOrder(order);
    }

    @GetMapping("/admin/orders")
    public List<OrderModel> getAllUsersOrders(){
        return orderService.getAllUsersOrders();
    }


}

