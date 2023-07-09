package com.example.webshop.service;

import com.example.webshop.model.Product;

import java.math.BigDecimal;

public interface ShoppingCartService {

    BigDecimal totalPrice = BigDecimal.ZERO;

    boolean addItem(Product product, int quantity, BigDecimal price);

    boolean removeItem(long articleNumber);

    void purchase();

}
