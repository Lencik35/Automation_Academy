package Homework;

import javax.management.modelmbean.ModelMBean;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ex6_Maps {
    //Maps:
    //Create a HashMap containing pairs of values - the toy name and the toy object (Product class).
    //Sort through and print pairs of values - entrySet().
    //Sort through and print a set of product names - keySet().
    //Sort through and print product values - values().
    //Create your own method for each iteration.
    public static void main(String[] args) {
        // Create a HashMap to store toy name and toy object pairs
        HashMap<String, Product> cosmeticShop = new HashMap<>();


        cosmeticShop.put("Shampoo", new Product("Elseve", 109.65));
        cosmeticShop.put("Shower Gel", new Product("Garnier", 25.33));
        cosmeticShop.put("Mask", new Product("L'Oreal", 29.99));

        System.out.println("Cosmetic Shop:");
        for (Map.Entry<String, Product> entry : cosmeticShop.entrySet()) {
            String cosmeticName = entry.getKey();
            Product cosmetic = entry.getValue();
            System.out.println(" Cosmetic name: " + cosmeticName + ", Price: $" + cosmetic.getPrice());
        }
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}