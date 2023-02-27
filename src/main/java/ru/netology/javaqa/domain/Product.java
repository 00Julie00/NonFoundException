package ru.netology.javaqa.domain;

import java.util.Collection;

public class Product {
    protected int id;
    protected String name;
    protected int price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public boolean matches(Product product, String search) {
        return (product.matches(search));
    }
}
