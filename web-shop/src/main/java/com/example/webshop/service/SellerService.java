package com.example.webshop.service;

import com.example.webshop.model.Product;
import com.example.webshop.model.User;

public interface SellerService {

    void notifyProductIsSold(Product product, User user);

    void notifyStockIsEmpty(Product product, User user);
}
