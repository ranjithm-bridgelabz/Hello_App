package com.demo;

public class StringLength {


    public static void main(String[] args) {

        // If no command-line arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build the list of names
        StringBuilder nameBuilder = new StringBuilder();

        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }


}
