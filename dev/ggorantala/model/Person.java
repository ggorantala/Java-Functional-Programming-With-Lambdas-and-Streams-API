package dev.ggorantala.model;

/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import java.util.Arrays;
import java.util.List;

public record Person(String name) {
  public static List<Person> PEOPLE =
      Arrays.asList(
          new Person("Alice"), //
          new Person("Bob"), //
          new Person("Charlie") //
          );
}
