package com.Classwork1;

import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    // input num1
    System.out.println("Enter A num: ");
    int num1 = myObj.nextInt();

    //print
    System.out.println(num1 / 100);
    System.out.println((num1 % 100) / 10);
    System.out.println(num1 % 10);
  }
}
