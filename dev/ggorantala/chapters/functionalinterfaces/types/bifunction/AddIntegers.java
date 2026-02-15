package dev.ggorantala.chapters.functionalinterfaces.types.bifunction;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import java.util.function.BiFunction;

public class AddIntegers {
    private static final Integer VALUE_ONE = 32;
    private static final Integer VALUE_TWO = 23;

    public static void main(String[] args) {
        biFunction();
    }

    private static void biFunction() {
        BiFunction<Integer, Integer, Integer> biFunctionAddition = Integer::sum;

        System.out.println(biFunctionAddition.apply(AddIntegers.VALUE_ONE, VALUE_TWO));
    }
}
