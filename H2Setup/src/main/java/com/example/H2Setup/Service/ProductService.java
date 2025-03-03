package com.example.H2Setup.Service;


import com.example.H2Setup.Model.Product;
import com.example.H2Setup.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Component
public class ProductService {

    @Autowired
    ProductRepo repo;
//    private List<Product> products=new ArrayList<>( Arrays.asList(
//            new Product(101,"iphone",200),
//            new Product(102,"laptop",300),
//            new Product(103,"fan",200)
//    ));

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProduct(int prodId) {
        return repo.findById(prodId).orElse(new Product(0,"Product Not Available",0));
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
