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

import dev.ggorantala.model.Book;

import java.util.List;

public class RefToStaticMethod {

  public static int compareByTitle(Book first, Book second) {
    return first.title().compareTo(second.title());
  }

  public static int compareByCost(Book first, Book second) {
    return first.costInEuros().compareTo(second.costInEuros());
  }

  public static void main(String[] args) {
    List<Book> books = Book.BOOKS;

    // Sort based on price
    System.out.println("SORT BASED ON PRICE: ");
    books.sort(RefToStaticMethod::compareByCost);

    books.stream() // Stream<Book> objects
        .map(book -> book.title() + ": " + book.costInEuros())
        .forEach(System.out::println);

    System.out.println("---------");

    // Sort based on price
    System.out.println("SORT BASED ON TITLES: ");
    books.sort(RefToStaticMethod::compareByTitle);

    books.stream() // Stream<Book> objects
        .map(book -> book.title() + ": " + book.rating())
        .forEach(System.out::println);
  }
}
