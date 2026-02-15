package dev.ggorantala.chapters.functionalinterfaces.types.predicate;
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
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        // formula
        Predicate<Integer> formula = num -> num % 2 == 0;

        // Filtering even numbers from the list
        List<Integer> evenNumbers = applyFilter(Constants.INTEGERS_LIST, formula);

        System.out.println("Even numbers: " + evenNumbers);
    }

    public static List<Integer> applyFilter(List<Integer> input, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer el : input) {
            if (predicate.test(el)) {
                result.add(el);
            }
        }
        return result;
    }
}
