package com.jlopez.sales;

import com.jlopez.products.Product;

public class Order {

    private final int idOrder;
    private final Product products[];
    private static int counterOrders;
    private int counterProducts;
    private final int maxProducts = 10;

    public Order(){
        this.idOrder = ++counterOrders;
        products = new Product[maxProducts];
    }

    public void addProduct(Product product){


        if (counterProducts < maxProducts) {
            products[counterProducts++] = product;
        } else {
            System.out.println("The limit of products has been reached:" +  maxProducts);
        }
    }

    public double calculateTotal() {
        double total = 0;

        for(int i = 0; i<counterProducts; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    public void showOrder(){
        System.out.println("Order # " + idOrder);
        System.out.println("Order Total $:" + calculateTotal());
        System.out.println("Products in the order");

        for(int i=0; i<counterProducts; i++){
            System.out.println(products[i]);
        }
    }
}
