package com.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * created by: ufuk on 6.10.2020 16:17
 */
public class ProductCatalog implements ICatalog {

    private String name;

    private List<ICatalog> catalogs;

    public ProductCatalog(String name) {
        this.name = name;
        catalogs = new ArrayList<>();
    }

    public void add(ICatalog catalog) {
        catalogs.add(catalog);
    }

    @Override
    public void drawHierarchy() {
        System.out.println(name);
        for (ICatalog component : catalogs) {
            component.drawHierarchy();
        }
    }
}