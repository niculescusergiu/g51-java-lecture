package org.example;

public class StringDemo {
    public static void main(String[] args) {

        String firstName = "Sergiu";
        String lastName = "Niculescu";
        //String fullName = firstName + " " + lastName;
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());
    }



}
