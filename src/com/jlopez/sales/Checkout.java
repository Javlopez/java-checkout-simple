package com.jlopez.sales;

import com.jlopez.products.Product;

public class Checkout {

    public static void main(String[] args) {
	// write your code here

        Product p1 = new Product("Shoes", 50.00);
        Product p2 = new Product("t-shirt", 150.80);
        Product p3 = new Product("pants", 310.90);

        Order order1 = new Order();

        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);

        order1.showOrder();

        Order order2 = new Order();
        Product p4 = new Product("skirt", 152.56);
        Product p5 = new Product("sneakers", 234.2);


        order2.addProduct(p1);
        order2.addProduct(p4);
        order2.addProduct(p5);
        order2.addProduct(p3);

        System.out.println("");
        order2.showOrder();

    }

}
