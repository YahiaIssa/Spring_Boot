package com.example.simpleWebApp.controller;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductServices services;


    @GetMapping("/Products")
    public List<Product> getProduct() {
        return services.getProduct();
    }

    // ميثود لإضافة منتج جديد (POST)
    @PostMapping("/Products/{proid}")
    public List<Product> addProduct(@RequestBody Product product) {
        services.addProduct(product);
        return services.getProduct();
    }
    @PutMapping("/Products")
    public void updateProduct(@RequestBody Product product) {
        services.updateProduct(product);

    }
    @DeleteMapping("/Products/{proid}")
    public void deleteProduct(@PathVariable int proid) {
        services.deleteProduct(proid);
    }

}