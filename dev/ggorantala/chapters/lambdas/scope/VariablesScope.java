package dev.ggorantala.chapters.lambdas.scope;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 23/06/23
 */

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

public class VariablesScope {
    private static final int staticVariable = 10;
    private final int instanceVariable = 20;

    public static void main(String[] args) {
        VariablesScope example = new VariablesScope();
        example.lambdaScopeExample();
    }

    public void lambdaScopeExample() {
        int localVariable = 30;

        // Lambda expression accessing local, instance, and static variables
        MyFunctionalInterface myLambda =
            () -> {
                System.out.println("Local variable: " + localVariable);
                System.out.println("Instance variable: " + instanceVariable);
                System.out.println("Static variable: " + staticVariable);
            };

        myLambda.myMethod();
    }
}
