package dev.ggorantala.chapters.methodreferences.kinds.arbitaryobject;

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

public class SortIntegers {

  public static void main(String[] args) {

    Constants.INTEGERS_LIST // list of integers
        .stream() // stream of integers
        .sorted(Integer::compareTo) // method reference
        .forEach(System.out::println); // print on console
  }
}
