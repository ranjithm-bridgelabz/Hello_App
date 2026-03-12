package com.demo;

public class StringBuilderApp {

    public static void main(String[] args) {

        String message;

        // Check if command-line arguments are provided
        if (args.length > 0) {

            // Use StringBuilder to build names
            StringBuilder names = new StringBuilder();

            // Loop through all arguments
            for (int i = 0; i < args.length; i++) {

                names.append(args[i]);

                // Add comma and space except for the last name
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }

            message = names.toString();

        } else {
            // Default value when no names are given
            message = "World";
        }

        // Print greeting message
        System.out.println("Hello, " + message + "!");
    }
}
