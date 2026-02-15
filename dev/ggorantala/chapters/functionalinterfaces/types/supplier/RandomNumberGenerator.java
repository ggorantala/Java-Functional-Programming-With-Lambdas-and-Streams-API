package dev.ggorantala.chapters.functionalinterfaces.types.supplier;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Supplier<Integer> randomNumberSupplier =
            () -> {
                Random random = new Random();
                return random.nextInt(100);
            };

        // Calling the get() method to get a random number
        Integer randomNumber = randomNumberSupplier.get();

        System.out.println("Random number: " + randomNumber);
    }
}
