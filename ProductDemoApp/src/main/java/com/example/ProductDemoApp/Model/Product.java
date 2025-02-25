package com.example.ProductDemoApp.Model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private int prodId;
    private String prodName;
    private int price;

    public int getProdId() {
        return prodId;
    }
}
