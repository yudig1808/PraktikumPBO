package com.yudigunawanpraktikumpbo8.YudiGunawan.Pertemuan8;

public class User {
    String email;
    String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public boolean verify(String email, String password){
        if(this.email.equals(email) && this.password.equals(password))
            return true;
        
        return false;
    }
}
