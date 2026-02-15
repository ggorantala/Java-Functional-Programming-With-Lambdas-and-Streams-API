package dev.ggorantala.chapters.otherstreams;
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

import java.util.stream.IntStream;

public class IntStreamExample {

    public static void main(String[] args) {
        range();
        System.out.println("---");
        rangeClosed();
        System.out.println("---");
        findMax();
    }

    private static void range() {
        // create an IntStream containing a range of values
        IntStream.range(Constants.START_RANGE_DELIMITER, Constants.END_RANGE_DELIMITER)
            // filter to keep only even values
            .filter(n -> n % 2 == 0)
            // map each value to its square
            .map(n -> n * n)
            // print the resulting values
            .forEach(System.out::println);
    }

    private static void rangeClosed() {
        // create an IntStream containing a range of values
        IntStream.rangeClosed(Constants.START_RANGE_DELIMITER, Constants.END_RANGE_DELIMITER)
            // filter to keep only even values
            .filter(n -> n % 2 == 0)
            // map each value to its square
            .map(n -> n * n)
            // print the resulting values
            .forEach(System.out::println);
    }

    private static void findMax() {
        // create an IntStream containing specified values
        IntStream.of(10, 20, 5000, 40, 50)
            // find the maximum value
            .max()
            // print the maximum value
            .ifPresent(System.out::println);
    }
}
