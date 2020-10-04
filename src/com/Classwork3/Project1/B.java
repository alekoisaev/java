package com.Classwork3.Project1;

import java.lang.Math;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {

        int a, b, c;

        Scanner s = new Scanner(System.in);

        //method 1
        System.out.println("Enter A: ");
        a = s.nextInt();

        System.out.println("Enter B: ");
        b = s.nextInt();

        System.out.println("Enter C: ");
        c = s.nextInt();

        //method 2
        int maximum = Math.max(a, b);
        if (maximum>b) {
            maximum = Math.max(a,c);
        } else {
            maximum = Math.max(b, c);
        }

        System.out.println("Max: " + maximum);

        //method 3
        int minimum = Math.min(a, b);
        if (minimum<b) {
            minimum = Math.min(a,c);
        } else {
            minimum = Math.min(b,c);
        }

        System.out.println("Min: " + minimum);
    }
}