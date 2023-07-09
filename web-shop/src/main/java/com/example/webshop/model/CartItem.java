package com.example.webshop.model;

import java.math.BigDecimal;

public class CartItem {

    String name;
    int quantity;
    BigDecimal price;

    public BigDecimal getPricePerQuantity(){
        return price.multiply(BigDecimal.valueOf(quantity));
    }

}
