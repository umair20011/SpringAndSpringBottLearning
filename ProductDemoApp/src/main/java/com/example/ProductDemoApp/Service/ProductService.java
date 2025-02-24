package com.example.ProductDemoApp.Service;

import com.example.ProductDemoApp.Model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Data
//@AllArgsConstructor
@Component
public class ProductService {

    private List<Product> products=new ArrayList<>( Arrays.asList(
            new Product(101,"iphone",200),
            new Product(102,"laptop",300),
            new Product(103,"fan",200)
    ));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProduct(int prodId){
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==prodId){
                return products.get(i);
            }
        }
        return new Product(000,"No Item Found",000);
    }
}
