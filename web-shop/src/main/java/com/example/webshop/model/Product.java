package com.example.webshop.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.net.URL;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public abstract class Product {

    private String name;
    private Long articleNumber;
    List<BigDecimal> prices;
    List<URL> pictures;
}
