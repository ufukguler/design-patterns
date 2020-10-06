package com.patterns.factory;

/**
 * created by: ufuk on 6.10.2020 12:43
 */
public class CarFactory {
    public ICar getType(String brand) {
        if (brand.equalsIgnoreCase("bmw")) {
            return new Bmw();
        } else if (brand.equalsIgnoreCase("audi")) {
            return new Audi();
        } else {
            return null;
        }
    }
}
