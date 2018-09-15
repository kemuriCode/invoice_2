package com.t0shi.model;

public class CartItem {

    private Product product;
    private double currentPrice;

    public CartItem(Product product) {
        this.product = product;
        this.currentPrice = product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    public static void printCart(Cart cart) {
        System.out.println("========================================");
        System.out.println("|Nazwa produktu\t|Cena\t|Cena promocyjna|");
        System.out.println("-----------------------------------------");
        for (CartItem item: cart.getItems()) {
            System.out.println("|"
                + item.getProduct().getName() + "\t"
                + item.getProduct().getPrice() + "\t"
                + item.getCurrentPrice() + "\t\t");
            System.out.println("-----------------------------------");
        }
        System.out.println("Suma: " + cart.totalPriceOfProduct());
        System.out.println("Suma po promocji: " + cart.totalPriceOfDiscountedProducts());

    }
}
