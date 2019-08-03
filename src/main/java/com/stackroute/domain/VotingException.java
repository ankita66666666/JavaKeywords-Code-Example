package com.stackroute.domain;

public class VotingException {

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("not valid");
        } 
    }

        public static void main (String args[]){
            try {
                validate(13);
            } catch (Exception | InvalidAgeException m) {
                System.out.println("Exception occured: " + m);
            }

            System.out.println("rest of the code...");
        }

    private static class InvalidAgeException extends Throwable {
        public InvalidAgeException(String not_valid) {
        }
    }
}


