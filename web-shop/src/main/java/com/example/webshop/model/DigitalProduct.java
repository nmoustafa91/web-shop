package com.example.webshop.model;


import com.example.webshop.enums.PurchaseMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class DigitalProduct extends Product{

    PurchaseMethod purchaseMethod;

}
