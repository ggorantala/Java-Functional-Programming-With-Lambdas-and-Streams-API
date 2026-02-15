package dev.ggorantala.chapters.functionalinterfaces.log;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

public class LoggerImpl implements Logger {

    @Override
    public void logMessage(String message) {
        System.out.println(message);
    }
}
