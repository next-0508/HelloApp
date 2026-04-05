package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloApp {
    public static void main(String[] args) {

        // If no arguments, print default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder to build the names string
        StringBuilder nameBuilder = new StringBuilder();

        // Enhanced for-loop
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove last comma and space
        nameBuilder.setLength(nameBuilder.length() - 2);

        // Print greeting
        System.out.println("Hello, " + nameBuilder + "!");
    }

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}
