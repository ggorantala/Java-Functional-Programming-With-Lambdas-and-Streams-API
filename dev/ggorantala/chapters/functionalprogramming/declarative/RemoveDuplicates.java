package dev.ggorantala.chapters.functionalprogramming.declarative;
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

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> uniqueValues =
            Constants.DUPLICATE_INTEGER_LIST // collections data
                .stream() // converting into Stream of integers
                .distinct()
                // .collect(Collectors.toList()); // or you can use `.toList();`
                .toList(); // or you can use `.toList();`

        System.out.println("Unique elements are: " + uniqueValues);
    }
}
