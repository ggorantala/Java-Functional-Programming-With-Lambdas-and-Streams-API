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

public class StreamMapExample {

    public static void main(String[] args) {

        Constants.FRUITS_LIST // list of string values
            .stream() // Stream<String>
            .map(String::length) // Stream<Integer>
            .toList()
            .forEach(System.out::println); // Output: Fruit Lengths: [5, 6, 6, 4, 5, 4]
    }
}
