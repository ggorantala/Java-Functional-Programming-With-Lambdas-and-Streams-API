package dev.ggorantala.chapters.functionalinterfaces.types.consumer;
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
import java.util.function.Consumer;

public class AndThenExample {

    public static void main(String[] args) {
        print(Constants.INTEGER_VALUE, Constants.MULTIPLIER, Constants.ANOTHER_MULTIPLIER);
    }

    public static void print(Integer A, Integer firstMultiplier, Integer secondMultiplier) {
        Consumer<Integer> firstConsumer =
            number -> System.out.println(number * firstMultiplier);
        Consumer<Integer> secondConsumer =
            number -> System.out.println(number * secondMultiplier);

        Consumer<Integer> thirdConsumer = firstConsumer.andThen(secondConsumer);

        // accept
        thirdConsumer.accept(A);
    }
}
