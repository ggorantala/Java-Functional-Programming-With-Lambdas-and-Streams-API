package dev.ggorantala.chapters.methodreferences.kinds;
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
import dev.ggorantala.model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class RefToConstructor {

    public static void main(String[] args) {

        List<Person> people =
            Constants.STRING_LIST // collection of names stored in list
                .stream() // stream of names
                .map(Person::new) // calling the constructor
                .collect(Collectors.toList());

        System.out.println(people);
    }
}
