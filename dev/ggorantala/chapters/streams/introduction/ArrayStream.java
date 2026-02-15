package dev.ggorantala.chapters.streams.introduction;

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

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {

  public static void main(String[] args) {
    IntStream myStream = Arrays.stream(Constants.INPUT_ARRAY);

    myStream.forEach(System.out::println);
  }
}
