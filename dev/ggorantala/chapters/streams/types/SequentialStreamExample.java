package dev.ggorantala.chapters.streams.types;

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

public class SequentialStreamExample {
  public static void main(String[] args) {
    Integer sum =
        Constants.INTEGERS_LIST // list of integers
            .stream() // Stream<Integer>
            .filter(n -> n % 2 == 0)
            .mapToInt(n -> n * 2)
            .sum();

    System.out.println(sum); // Output: 12
  }
}
