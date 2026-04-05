package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloApp {
    public static void main(String[] args) {

        String name;

        // Check if any arguments are passed
        if (args.length > 0) {

            // Use StringBuilder to combine names
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                // Add comma and space except for last element
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();

        } else {
            // Default value
            name = "World";
        }

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}
