package com.example.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class Product {
    private int proid;
    private String productName;
    private int productPrice;

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public Product(int proid, String productName, int productPrice) {
        this.proid = proid;
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
