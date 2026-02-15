package dev.ggorantala.chapters.functionalinterfaces.example;

/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

public class PowerOfTwoExecutor {
  public static void main(String[] args) {
    System.out.println(isPowerOfTwo(4));
    System.out.println(isPowerOfTwo(3));
    System.out.println(isPowerOfTwo(10));
    System.out.println(isPowerOfTwo(16));
  }

  public static boolean isPowerOfTwo(Integer A) {

    /*
     To understand this following formula,
     read a lesson from my other course:
       1) https://www.ggorantala.dev/power-of-2/
       2) https://www.ggorantala.dev/solution-review-power-of-2/
    */
    PowerOfTwo helper = n -> n != 0 && (n & (n - 1)) == 0; // lambda expression
    return helper.isPowerOfTwo(A);
  }
}
