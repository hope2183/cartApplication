package com.example.cartapplication.configuration;

import com.example.cartapplication.Cart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class CartConfiguration {
    @Bean
    @SessionScope
    public Cart createCart(){
        return new Cart();
    }
}

