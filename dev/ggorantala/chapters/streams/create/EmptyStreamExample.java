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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmptyStreamExample {
    public static void main(String[] args) {
        // not empty collection items
        System.out.println("Non empty collections");
        isEmptyStream(Constants.LANGUAGES_LIST).forEach(System.out::println);

        // for empty collections
        System.out.println("Empty collections");
        List<String> emptyLocales = new ArrayList<>();

        isEmptyStream(emptyLocales).forEach(System.out::println); // prints nothing
    }

    /**
     * Returns an empty stream if the input list is null or empty, otherwise returns a stream of the list.
     *
     * @param languages a list of language strings to stream
     * @return a stream of languages, or an empty stream if the input is null/empty
     */
    public static Stream<String> isEmptyStream(List<String> languages) {
        return languages == null || languages.isEmpty() ? Stream.empty() : languages.stream();
    }
}
