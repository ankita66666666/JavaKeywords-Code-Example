package com.stackroute.domain;

public class Constructor {
    static class Student {
        int id;
        String name;

        //creating a parameterized constructor
        Student(int i, String n) {
            id = i;
            name = n;
        }

        //method to display the values
        void display() {
            System.out.println(id + " " + name);
        }
    }
}