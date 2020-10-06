package com.patterns.factory;

/**
 * created by: ufuk on 6.10.2020 12:47
 */
public class App {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        ICar car = factory.getType("bmw");
        System.out.println(car.getDescription());

        // case insensitive AuDi
        ICar car2 = factory.getType("AuDi");
        System.out.println(car2.getDescription());
    }
}
