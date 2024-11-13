package com.youssef.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.youssef.users.service.UserService;
@SpringBootApplication
@EnableDiscoveryClient
public class UsersMicroservice2Application {

    public static void main(String[] args) {
        SpringApplication.run(UsersMicroservice2Application.class, args);
    }
    
    @Autowired
    UserService userService;
    
  
}