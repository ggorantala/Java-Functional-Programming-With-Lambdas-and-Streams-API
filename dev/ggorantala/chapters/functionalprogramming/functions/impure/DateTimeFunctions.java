package dev.ggorantala.chapters.functionalprogramming.functions.impure;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import java.time.LocalDateTime;
import java.util.Date;

public class DateTimeFunctions {
    public static void main(String[] args) {
        printDateTime();
    }

    public static void printDateTime() {
        Date currentDate = new Date();
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date is: " + currentDate + ", and time is: " + currentDateTime);
    }
}
