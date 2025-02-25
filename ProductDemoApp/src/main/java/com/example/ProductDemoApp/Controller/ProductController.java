package com.example.ProductDemoApp.Controller;

import com.example.ProductDemoApp.Model.Product;
import com.example.ProductDemoApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/product")
    public List<Product> getProducts(){

        return productService.getProducts();

    }

    @RequestMapping("/")
    public String greet(){
        return "Welcome to my Product site";
    }

    @RequestMapping("/product/{prodId}")
    public Product getProduct(@PathVariable int prodId){
        return productService.getProduct(prodId);
    }
}
