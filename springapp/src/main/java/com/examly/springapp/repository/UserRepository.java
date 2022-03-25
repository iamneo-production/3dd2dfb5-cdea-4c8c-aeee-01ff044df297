package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import com.examly.springapp.model.UserModel;

@Repository
 public interface UserRepository extends JpaRepository<UserModel, Long>{
    

 public UserModel findByEmailAndPassword(String email,String password);

 public UserModel findUserByEmail(String Email);

 @Async
 @Query("select u.user_role,u.emailId from UserModel u where u.emailId= emailId")
 public UserModel findByEmailAndUserRole(@Param("user_role") String user_role,@Param("email") String email);
}