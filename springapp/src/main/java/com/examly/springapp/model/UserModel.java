package com.examly.springapp.model;

import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="username")
    private String username;

    @Column(name="mobileNumber")
    private String mobileNumber;

    @Column(name="active")
    private boolean active;

    @Column(name="role")
    private String role;
     
    @Column(name="cart")
    private CartModel cart;

    @Column(name="ordersList")
    private List<OrderModel> ordersList;

    User(){}
    User(String email,String password,String username,String mobileNumber,boolean active,String role,String resetPasswordToken){
        this.email = email;
        this.password = password;
        this.username = username;
        this.active = active;
        this.mobileNumber = mobileNumber;
        this.role = role;
        this.cart = cart;
        this.ordersList = ordersList;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    public void setRole(String role){
        this.role = role;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public void setCart(CartModel cart){
        this.cart = cart;
    }

    public void setOrdersList(List<OrderModel> )







