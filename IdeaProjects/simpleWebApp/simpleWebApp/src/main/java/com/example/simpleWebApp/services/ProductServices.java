package com.example.simpleWebApp.services;

import com.example.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServices {


    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50),
            new Product(102, "Samsung", 70),
            new Product(103, "Nokia", 80)
    ));

    public List<Product> getProduct() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProid() == prod.getProid()) {
                index = i;
            }

        }
        products.set(index, prod);
    }

    public void deleteProduct(int proid) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProid() == proid) {
                index = i;
            }
            products.remove(index);
        }
    }
}