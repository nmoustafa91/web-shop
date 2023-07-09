package com.example.webshop.service;

import com.example.webshop.model.Product;
import com.example.webshop.model.User;

public interface CustomerService {

    void notifyWithProductUpdate(Product product, User user);
}
