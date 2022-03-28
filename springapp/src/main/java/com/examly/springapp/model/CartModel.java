package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;



@Entity
@Table(name="cart")
public class CartModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

     @Column
    private String cartItemID;

    @OneToOne(cascade = CascadeType.ALL)
    private UserModel userId;

    @Column
    private String ProductName;

    @Column
    private int Quantity;

    @Column
    private String Price;

    public CartModel(){}
    public CartModel(int id,String cartItemID,UserModel userId,String ProductName,int Quantity,String Price){
        this.id = id;
        this.cartItemID = cartItemID;
        this.userId = userId;
        this.ProductName = ProductName;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    public CartModel(String cartItemID,UserModel userId,String ProductName,int Quantity,String Price){
        this.cartItemID = cartItemID;
        this.userId = userId;
        this.ProductName = ProductName;
        this.Quantity = Quantity;
        this.Price = Price;
    }
    
    public void setCartItemId(String cartItemID){
        this.cartItemID = cartItemID;
    }

    public void setUserId(UserModel userId){
        this.userId = userId;
    }

    public void setProductName(String ProductName){
        this.ProductName = ProductName;
    }

    public void setQuantity(int Quantity){
        this.Quantity = Quantity;
    }

    public void setPrice(String Price){
        this.Price = Price;
    }

    public String getCartItemId(){
        return this.cartItemID;
    }

    public UserModel getUserId(){
        return this.userId;
    }

    public String getProductName(){
        return this.ProductName;
    }

    public int getQuantity(){
        return this.Quantity;
    }

    public String getPrice(){
        return this.Price;
    }


    
}
