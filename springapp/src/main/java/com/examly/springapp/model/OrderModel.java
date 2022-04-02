package com.examly.springapp.model;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name = "orders")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="orderId",unique=true,nullable=false)
    private String orderId;

    @Column(name="userId")
    private String userId;

    @Column(name="productName")
    private String ProductName;

    @Column(name="quantity")
    private int quantity;

    @Column(name="totalPrice")
    private String totalPrice;

    @Column(name="status")
    private String Status;

    @Column(name="price")
    private String Price;

    public OrderModel(){}
    public OrderModel(String orderId,String userId,String ProductName,int quantity,String totalPrice,String Status,String Price){
        this.orderId = orderId;
        this.userId = userId;
        this.ProductName = ProductName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.Status = Status;
        this.Price = Price;
    }

    public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String ProductName) {
		this.ProductName = ProductName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String Status) {
		this.Status = Status;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String Price) {
		this.Price = Price;
	}
    
}
