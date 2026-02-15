package dev.ggorantala.chapters.functionalinterfaces.exercises.problemtwo;

/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

public class Solution {
  public static void main(String[] args) {
    PowerOfTwoFI helper = n -> n != 0 && (n & (n - 1)) == 0; // lambda expression

    System.out.println(helper.isPowerOfTwo(4));
    System.out.println(helper.isPowerOfTwo(3));
    System.out.println(helper.isPowerOfTwo(10));
    System.out.println(helper.isPowerOfTwo(16));
  }
}
