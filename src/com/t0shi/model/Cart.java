package com.t0shi.model;
import java.util.ArrayList;

import static com.t0shi.model.Product.getSampleProducts;

public class Cart {

    ArrayList<CartItem> items = new ArrayList<CartItem>();

    public double totalPriceOfProduct() {

        double sum = 0;
        for (CartItem item : items) {
            sum += item.getProduct().getPrice();
        }
        return sum;
    }

    public double totalPriceOfDiscountedProducts() {
        double sum = 0;
        for (CartItem item : items) {
            sum+=item.getCurrentPrice();

        }
        return sum;
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public static Cart getSampleCart() {
        Cart cart = new Cart();
        for (Product p: getSampleProducts()) {
            cart.getItems().add(new CartItem(p));
        }
        return cart;
    }
}