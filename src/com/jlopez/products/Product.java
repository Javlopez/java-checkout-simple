package com.jlopez.products;

public class Product {

    private int idProduct;
    private String name;
    private double price;
    private static int counterProducts;

    private Product(){
        this.idProduct = counterProducts++;
    }

    public Product(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

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

    @Override
    public String toString(){
        return "Product{id_product # " + this.idProduct +", name=" + name + ", price=" + price +"}";
    }
}
