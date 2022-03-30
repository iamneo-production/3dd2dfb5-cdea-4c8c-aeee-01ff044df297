package com.examly.springapp.model;

import java.lang.annotation.Inherited;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
public class CartModel {

    @Id
    private String cartItemID;

    @OneToOne(cascade=CascadeType.ALL)
    private UserModel userId;

    @Column()
    private String ProductName;
    
    @Column(nullable=false)
    private int Quantity;

    @Column(nullable=false)
    private String Price;
    

    public CartModel(String cartItemID, UserModel userId, String productName, int quantity, String price) {
        this.cartItemID = cartItemID;
        this.userId = userId;
        this.ProductName = productName;
        this.Quantity = quantity;
        this.Price = price;
    }

    public String getCartItemID() {
        return cartItemID;
    }

    public void setCartItemID(String cartItemID) {
        this.cartItemID = cartItemID;
    }

    public UserModel getUserId() {
        return userId;
    }

    public void setUserId(UserModel userId) {
        this.userId = userId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    
}
