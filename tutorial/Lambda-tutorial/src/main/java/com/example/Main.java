package com.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // A lambda expression is a short block of code which takes in parameters and returns a value.
        // Lambda expressions are similar to methods,
        // but they do not need a name and they can be implemented right in the body of a method.
        // Lambda expression: (arguments) -> {statement/s}
        // Expressions are limited.
        // They have to immediately return a value,
        // and they cannot contain variables, assignments or statements such as if or for.
        // In order to do more complex operations, a code block can be used with curly braces.
        // If the lambda expression needs to return a value,
        // then the code block should have a return statement.
        // Lambda expressions can be stored in variables if the variable's type is an interface which has only one method.
        // The lambda expression should have the same number of parameters and the same return type as that method.
        // Java has many of these kinds of interfaces built in, such as the Consumer interface (found in the java.util package) used by lists.
        String name = "Tri";
        char symbol = '!';

        MyInterface myInterface = (x,y) -> {
            System.out.println("Heello world!");
            System.out.println("It is a nice day " + x + y);
        };

        MyInterface myInterface2 = (x,y) -> {
            System.out.println("Hello " + x+y);
        };

        myInterface.message(name, symbol);
        myInterface2.message(name, symbol);

    }
}