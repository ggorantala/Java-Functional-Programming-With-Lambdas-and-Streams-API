package dev.ggorantala.chapters.functionalprogramming.functions.pure;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import dev.ggorantala.Constants;

import java.util.function.Predicate;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        boolean result = isEven(Constants.INTEGER_VALUE);
        System.out.println(result);
    }

    public static boolean isEven(Integer A) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        return isEven.test(A);
    }
}
