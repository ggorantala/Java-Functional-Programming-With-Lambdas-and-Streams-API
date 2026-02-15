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

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
  public static void main(String[] args) {
    UnaryOperator<Integer> doubleOperator = x -> x * 2;
    int result = doubleOperator.apply(Constants.VALUE); // result will be 10

    System.out.println(result);
  }
}
