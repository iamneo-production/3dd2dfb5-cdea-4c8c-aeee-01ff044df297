package com.examly.springapp.service;
import java.util.*;
import java.lang.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import com.examly.springapp.model.UserModel;
import org.springframework.context.annotation.Bean;

import com.examly.springapp.model.LoginModel;
import com.examly.springapp.repository.UserRepository;
import com.examly.springapp.controller.AuthController;
import org.springframework.context.annotation.Configuration;
@Service
public class UserService {
	
	@Autowired
	private UserRepository UserRepository;
    
   public  UserService(){

    }
	
    public UserModel saveUser(UserModel user)
    {
        return UserRepository.save(user);
    }

    
    public UserModel fetchUserByEmail(String email)
    {
        return UserRepository.findUserByEmail(email);
    }
    
    public UserModel fetchByEmailAndPassword(String email,String password)
    {   

        return UserRepository.findByEmailAndPassword(email,password);

    }

    public UserModel fetchByEmailAndUserRole(String email,String user_role){
        return UserRepository.findByEmailAndUserRole(email,user_role);
    }
    
	
}