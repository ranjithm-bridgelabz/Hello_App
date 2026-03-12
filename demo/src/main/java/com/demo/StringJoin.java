package com.demo;

public class StringJoin {


    public static void main(String[] args) {

        // Default name
        String names = "World";

        // If arguments are provided, join them with comma and space
        if (args.length > 0) {
            names = String.join(", ", args);
        }

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}
