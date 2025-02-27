package com.example.ProductDemoApp.Controller;

import com.example.ProductDemoApp.Model.Product;
import com.example.ProductDemoApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/product/{prodId}")
    public Product getProduct(@PathVariable int prodId){
        return productService.getProduct(prodId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod){
        productService.addProduct(prod);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prod){
        productService.updateProduct(prod);
    }

    @DeleteMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        productService.deleteProduct(prodId);
    }

}
