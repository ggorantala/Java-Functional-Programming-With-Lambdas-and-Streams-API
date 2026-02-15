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

import java.util.List;
import java.util.stream.Collectors;

public class IntegerStream {

    public static void main(String[] args) {
        List<Integer> result = streamOperation(Constants.INTEGERS_LIST);
        result.forEach(System.out::println);
    }

    public static List<Integer> streamOperation(List<Integer> input) {
        return input // collection of integers
            .stream() // Stream of integers
            .map(n -> n * 2)
            .collect(Collectors.toList());
    }
}
