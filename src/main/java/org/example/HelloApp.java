package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloApp {
    public static void main(String[] args) {

        // Default case: no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String names = "";

        // Enhanced for-loop to build string
        for (String name : args) {
            names += name + ", ";
        }

        // Remove trailing ", " using substring
        names = names.substring(0, names.length() - 2);

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}
