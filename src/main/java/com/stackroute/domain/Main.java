package com.stackroute.domain;

public class Main {

    public static void main(String args[]) {
        //creating objects and passing values
        Constructor.Student s1 = new Constructor.Student(111, "Karan");
        Constructor.Student s2 = new Constructor.Student(222, "Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();

    }
}


