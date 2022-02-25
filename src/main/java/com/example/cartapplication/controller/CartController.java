package com.example.cartapplication.controller;

import com.example.cartapplication.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
@GetMapping("/add")

    public List<Integer> addItems (@RequestParam List<Integer> idList){
        return cartService.addItems(idList);
    }
    @GetMapping("/get")
    public List<Integer> getItems (){
        return cartService.getItems();
    }


}
