package com.stackroute.domain;
//Class for Arrays Implementation.
public class Array {
    //method for String
    public static void main(String[] args) {

        String[] employeename = {"Suraj", "Riya", "Firoj", "mukul"};
        //Using for loop through an array
        for (int i = 0; i < employeename.length; i++) {
            System.out.println(employeename[i]);
        }
        //Multidimentional Arrays containing two arrays
            int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        //Using Arrays for storing integer value
            for (int i = 0; i < myNumbers.length; ++i) {
                for (int j = 0; j < myNumbers[i].length; ++j) {
                    System.out.println(myNumbers[i][j]);
                }
            }
        }
    }





