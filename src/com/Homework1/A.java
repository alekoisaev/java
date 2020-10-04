package com.Homework1;

import java.util.Scanner;

public class A {

    int x;
    String hello;

    //constructor
    public A(String phrase) {
        hello = phrase;
    }

    public static void main(String[] args) {
        B cons = new B("Hello");
        System.out.println(cons.hello);

        cons.method1();
        cons.method2();
        cons.method3();
        cons.b_method1();
        cons.b_method2();
    }

    public void method1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = s.nextInt();
    }

    public void method2() {
        System.out.println(x+12);
    }

    public void method3() {
        if (x % 2 == 0) {
            System.out.println("X is even");
        } else {
            System.out.println("X is odd");
        }
    }
}