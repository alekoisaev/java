package com.Classwork1;

import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter A, B and C:");

    int A = myObj.nextInt();
    int B = myObj.nextInt();
    int C = myObj.nextInt();

    System.out.println("A + B + C = " + (A + B + C));
    System.out.println("A * B * C = " + (A * B * C));
  }
}
