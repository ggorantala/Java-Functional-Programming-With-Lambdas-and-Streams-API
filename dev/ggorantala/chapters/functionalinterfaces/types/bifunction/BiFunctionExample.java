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

import dev.ggorantala.Constants;

import java.util.function.BiFunction;

public class BiFunctionExample {
  public static void main(String[] args) {
    BiFunction<String, String, String> concatenateFunction = (s1, s2) -> s1 + s2;

    // Concatenating two strings using the apply() method
    String result = concatenateFunction.apply(Constants.FIRST_STRING, Constants.SECOND_STRING);

    System.out.println("Result: " + result);
  }
}
