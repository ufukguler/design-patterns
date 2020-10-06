package com.patterns.composite;

/**
 * created by: ufuk on 6.10.2020 16:22
 */
public class App {
    public static void main(String[] args) {

        populate();

    }

    static void populate() {
        // root catalog
        ProductCatalog phones = new ProductCatalog(">Phones");

        // children of root
        ProductCatalog iPhone = new ProductCatalog(">> iPhone");
        ProductCatalog samsung = new ProductCatalog(">> Samsung");
        ProductCatalog xiaomi = new ProductCatalog(">> Xiaomi");

        // children of root's children
        Product iphoneItem = new Product(">>> iPhone phone");
        Product samsungItem = new Product(">>> Samsung phone");
        Product xiaomiItem = new Product(">>> Xiaomi phone");

        // add brands to under phones
        phones.add(iPhone);
        phones.add(samsung);
        phones.add(xiaomi);

        // add phone models to their own brand
        iPhone.add(iphoneItem);
        samsung.add(samsungItem);
        xiaomi.add(xiaomiItem);

        // draw the hierarchy of products
        phones.drawHierarchy();
    }
}
