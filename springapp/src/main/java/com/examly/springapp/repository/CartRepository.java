package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.CartModel;


@Repository
public interface CartRepository extends JpaRepository<CartModel, Integer>{
    public List<CartModel> findByUserId(int id);
    public void deleteById(int id);

}
