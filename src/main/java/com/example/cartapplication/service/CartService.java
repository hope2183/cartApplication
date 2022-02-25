package com.example.cartapplication.service;

import java.util.List;

public interface CartService {

    public List<Integer> addItems (List<Integer> items);
    public List<Integer> getItems ();
}
