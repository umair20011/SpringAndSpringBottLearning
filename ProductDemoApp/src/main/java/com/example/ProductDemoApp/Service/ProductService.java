package com.example.ProductDemoApp.Service;

import com.example.ProductDemoApp.Model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductService {

    List<Product> products= Arrays.asList(
            new Product(101,"iphone",200),
            new Product(102,"laptop",300),
            new Product(103,"fan",200)
    );

    public List<Product> getProduct(){
        return products;
    }

}
