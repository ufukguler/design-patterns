package com.patterns.composite;

/**
 * created by: ufuk on 6.10.2020 16:21
 */
public class Product implements ICatalog {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public void drawHierarchy() {
        System.out.println(this.name);
    }
}
