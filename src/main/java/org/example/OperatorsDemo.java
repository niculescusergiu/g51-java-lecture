package org.example;

public class OperatorsDemo {
    public static void main(String[] args) {
        //Assignment Operator
        int number1 = 10;
        int number2 = 5;
        System.out.println(number1); // 10
        System.out.println(number2); // 5
        number1 = number2;
        System.out.println(number1); // 5
        System.out.println(number2); // 5

        //Arithmetic Operators
        int x = 10;
        int y = 5;
        int sum = x + y; //addition
        int difference = x - y; //subtraction
        int multiplication = x * y;
        int quotient = x / y; //division
        int remainder = x % y; //modulus or remainder
        System.out.println(sum);
        System.out.println("quotient: " + quotient);
        System.out.println("remainder: " + remainder);

        //Comparison operators
        boolean isEqual = x == y;
        System.out.println(x == y); //false
        System.out.println(x >= y); //true
        System.out.println(x != y); //true

        //Increment and decrement operators
        int count = 5;
        //count = count + 1;
        System.out.println(++count);
    } //main
} //class
