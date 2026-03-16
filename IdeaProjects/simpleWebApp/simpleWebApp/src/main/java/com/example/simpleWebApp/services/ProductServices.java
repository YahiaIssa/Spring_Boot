package com.example.simpleWebApp.services;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServices {
    @Autowired
    ProductRepo repo;

    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 50),
//            new Product(102, "Samsung", 70),
//            new Product(103, "Nokia", 80)
    )
    );

    public List<Product> getProduct() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);

    }


    public void deleteProduct(int proId) {
        repo.deleteById(proId);
    }
}
