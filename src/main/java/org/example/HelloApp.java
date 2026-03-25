package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloApp {
    public static void main(String[] args) {

        String name = "";
        try {
            name = args[0];
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Hello, " + name + "!");
    }
}
