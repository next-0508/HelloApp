package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloApp {
    public static void main(String[] args) {

        // Default case: no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join names with comma and space
            String names = String.join(", ", args);

            // Print greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}
