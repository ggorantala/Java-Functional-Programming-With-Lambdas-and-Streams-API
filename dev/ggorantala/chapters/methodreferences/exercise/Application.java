package dev.ggorantala.chapters.methodreferences.exercise;

/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import dev.ggorantala.model.Book;

import java.util.Comparator;
import java.util.List;

public class Application {
  public static void main(String[] args) {
    List<Book> books = Book.BOOKS;
    books.forEach(System.out::println);

    // sort book objects
    books.sort(Comparator.comparing(Book::title));

    System.out.println("----After Sorting----");
    books.forEach(System.out::println);
  }
}
