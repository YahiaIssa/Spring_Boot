package com.example.ecom_proj.controller;
import com.example.ecom_proj.model.Product;
import com.example.ecom_proj.services.ProductServices;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductServices services;
    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }
    @GetMapping("/products")

    public ResponseEntity <List<Product>> getAllProduct(){
        return new ResponseEntity<>(services.getAllProduct(), HttpStatus.OK);

    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){
        Product product = services.getProductById(id);
        if (product != null){
            return new ResponseEntity<>(product, HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
