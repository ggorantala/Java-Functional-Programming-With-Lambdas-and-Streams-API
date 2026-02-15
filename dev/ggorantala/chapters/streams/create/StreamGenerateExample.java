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

import java.util.stream.Stream;

public class StreamGenerateExample {
    public static void main(String[] args) {
        Stream<Integer> stream =
            Stream.generate(() -> Constants.INTEGER_VALUE).limit(Constants.LIMIT_VALUE);
        stream.forEach(System.out::println);
    }
}
