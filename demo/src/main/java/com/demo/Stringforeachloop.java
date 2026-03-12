package com.demo;

public class Stringforeachloop {


    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder to build the greeting
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        // Enhanced for loop to iterate through args
        for (String name : args) {

            if (!first) {
                nameBuilder.append(", ");
            }

            nameBuilder.append(name);
            first = false;
        }

        // Display final greeting
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}

