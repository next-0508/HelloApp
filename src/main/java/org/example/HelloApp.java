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

        // Build greeting using enhanced for-loop
        StringBuilder names = new StringBuilder();

        for (String name : args) {
            names.append(name).append(", ");
        }

        // Remove trailing comma and space
        names.setLength(names.length() - 2);

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}
