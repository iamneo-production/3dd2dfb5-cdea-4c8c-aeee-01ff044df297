package com.examly.springapp.model;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "products")
public class ProductModel{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;

    @Column(name = "product_Id")
    private String productId;

    @Column(name = "image_Url")
    private String imageUrl;

    @Column(name = "product_Name")
    private String productName;

    @Column(name = "price")
    private double price;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private int quantity;

    public ProductModel(){}
    public ProductModel(String productId,String imageUrl,String productName,double price,String description,int quantity){
        this.productId = productId;
        this.imageUrl = imageUrl;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public void setProductId(String productId){
        this.productId = productId;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getProductId(){
        return this.productId;
    }

    public String getImageUrl(){
        return this.imageUrl;
    }

    public String getProductName(){
        return this.productName;
    }

    public double getPrice(){
        return this.price;
    }

    public String getDescription(){
        return this.description;
    }

    public int getQuantity(){
        return this.quantity;
    }
}


