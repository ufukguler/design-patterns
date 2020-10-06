package com.patterns.singleton;

/**
 * created by: ufuk on 6.10.2020 12:39
 */
public class App {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        System.out.println("SingleObject instance is : " + SingleObject.getInstance());
        singleObject.sayHello();
    }
}
