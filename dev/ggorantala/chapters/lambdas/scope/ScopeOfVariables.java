package dev.ggorantala.chapters.lambdas.scope;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

public class ScopeOfVariables {
    static String fruitName = "apples"; // static variable
    Long id = 100L; // instance variable

    public static void main(String[] args) {
        ScopeOfVariables app = new ScopeOfVariables();
        app.show();
    }

    public static void logger(Logger logger) {
        logger.logMessage("logging message");
    }

    public void show() {
        boolean flag = true; // local variable
        logger(
            courseTitle -> {
                // instance variable is accessible through this keyword
                System.out.println("instance variable: " + this.id);

                // static methods are accessible.
                System.out.println("static variable: " + fruitName);

                // local variable is also accessible
                System.out.println("Local variable: " + flag);

                // lambda input parameter
                System.out.println(courseTitle);
            });
    }
}
