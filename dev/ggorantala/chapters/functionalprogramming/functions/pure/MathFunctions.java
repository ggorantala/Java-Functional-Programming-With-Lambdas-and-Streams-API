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

public class MathFunctions {

  public static void main(String[] args) {

    double result = mathOperation(Constants.INTEGER_FIRST_VALUE, Constants.INTEGER_SECOND_VALUE);
    System.out.println(result);
  }

  public static Double mathOperation(Integer a, Integer b) {
    return Math.pow(a, b);
  }
}
