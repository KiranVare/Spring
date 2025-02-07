package com.spring.aop.spring_aop.Services;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service //-->it works same has the component
public class LoginService {

    Scanner scanner = new Scanner(System.in);

    public void mainLogin()
    {
        System.out.println("Fetching User.......");
        System.out.println("Please wait...");
        System.out.println("User logged in successfully");
    }

    public void userLogin(String username,String password)
    {
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
//        System.out.println("user logged in successfully");

    }


}
