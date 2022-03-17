package com.examly.springapp.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class LoginModel {
    @Id
    private String email;

    private String password;

    LoginModel(){}
    LoginModel(String email,String password){
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email){
        this.email = email;  
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserModel)) return false;
        LoginModel user = (LoginModel) o;
        return Objects.equals(password, user.getPassword()) &&
                Objects.equals(email, user.getEmail());
    }

}
    

