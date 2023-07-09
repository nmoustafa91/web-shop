package com.example.webshop.model;

import com.example.webshop.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public abstract class User {

    private String userId;
    private String name;
    private String email;
    private Address address;
    private UserType userType;
}
