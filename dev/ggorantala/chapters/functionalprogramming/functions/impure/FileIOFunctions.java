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

import java.io.FileWriter;
import java.io.IOException;

public class FileIOFunctions {
    public static void main(String[] args) throws IOException {
        fileIOOperations();
    }

    public static void fileIOOperations() throws IOException {
        FileWriter writer = new FileWriter("example.txt");
        writer.write("Hello, world!");
        writer.close();
    }
}
