package com.patterns.singleton;

/**
 * created by: ufuk on 6.10.2020 12:36
 */
public class SingleObject {
    // only object of SingleObject class
    private static SingleObject singleObject = new SingleObject();

    // private constructor - cannot be instantiated
    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return singleObject;
    }

    public void sayHello() {
        System.out.println("Hello from SingleObject.class!");
    }
}
