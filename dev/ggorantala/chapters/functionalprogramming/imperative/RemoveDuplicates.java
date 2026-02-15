package dev.ggorantala.chapters.functionalprogramming.imperative;
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

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> uniqueValues = new ArrayList<>();

        // in below, `value` variable is changed/updated for each iteration - "imperative way".
        for (Integer value : Constants.DUPLICATE_INTEGER_LIST) {
            if (!uniqueValues.contains(value)) {
                uniqueValues.add(value);
            }
        }
        System.out.println("Unique elements are: " + uniqueValues);
    }
}
