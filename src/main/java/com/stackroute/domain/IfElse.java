package com.stackroute.domain;

public class IfElse {
    public static int a = 4;
    public static int b = 6;

    public static void main(String args[]) {
        // block of code to be executed if the condition is true
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            // block of code to be executed if the condition is false
            System.out.println("b is greater than a");
        }
    }
}
