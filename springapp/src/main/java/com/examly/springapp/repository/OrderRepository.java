package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.*;

import com.examly.springapp.model.OrderModel;


@Repository
public interface OrderRepository extends JpaRepository<OrderModel, String>{

    @Query(value = "SELECT * FROM order WHERE user_id=?1", nativeQuery = true)
    List<OrderModel> findByUserId(String userId);


}