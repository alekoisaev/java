package com.Classwork3.Project1;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a, b;

        //method 1
        System.out.println("Enter A: ");
        a = s.nextInt();

        System.out.println("Enter B: ");
        b = s.nextInt();

        //method 2
        System.out.println("Sum: " + (a + b));

        //method 3
        System.out.println("Multiply: " + (a * b));

    }

}