package dev.ggorantala.chapters.functionalinterfaces;
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

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> addOperator = Integer::sum;
        int result =
            addOperator.apply(
                Constants.INTEGER_FIRST_VALUE, Constants.INTEGER_SECOND_VALUE); // result will be 5

        System.out.println(result); // 5
    }
}
