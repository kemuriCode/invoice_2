package com.t0shi.model;

import java.util.ArrayList;

public class Product {

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static ArrayList<Product> getSampleProducts() {
        ArrayList<Product> sample = new ArrayList<>();
        for (int i=1; i<=5; i++) {
            Product p = new Product();
            p.setName("Product " +i);
            p.setPrice(i*25);
            sample.add(p);
        }
        return sample;
    }
}
