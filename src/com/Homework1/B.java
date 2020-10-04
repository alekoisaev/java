package com.Homework1;

import java.util.Scanner;

class B extends A {

    int y;

    public B(String phrase) {
        super(phrase);
    }


    public void b_method1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter y: ");
        y = s.nextInt();
    }

    public void b_method2() {
        System.out.println("Sum: " + (x+y));
    }
}