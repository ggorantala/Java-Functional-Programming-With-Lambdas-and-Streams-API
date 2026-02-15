package dev.ggorantala.chapters.streams.create;

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

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OtherStreams {
  public static void main(String[] args) {
    IntStream.range(Constants.START_DELIMITER, Constants.END_DELIMITER)
        .forEach(System.out::println);

    LongStream.range(Constants.START_RANGE_DELIMITER, Constants.END_RANGE_DELIMITER)
        .forEach(System.out::println);

    new Random().doubles(2).forEach(System.out::println);
  }
}
