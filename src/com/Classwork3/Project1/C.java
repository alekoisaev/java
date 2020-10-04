package com.Classwork3.Project1;

import java.util.Scanner;

public class C {

    public static void main(String[] args) {

        int a, b, c;

        Scanner s = new Scanner(System.in);

        //method 1
        System.out.println("Method 1");
        System.out.println("Enter A: ");
        a = s.nextInt();

        System.out.println("Enter B: ");
        b = s.nextInt();

        System.out.println("Enter C: ");
        c = s.nextInt();

        //method 2
        int a_first = a%10;
        System.out.println("Method 2: " + a_first);

        //method 3
        int b_last = b;
        while (b_last > 9) {
            b_last /= 10;
        }
        System.out.println("Method 3: " + b_last);

        //method 4
        int m, n, sum = 0;
        m = c;
        if ((m / 10) == 0) {
            sum = c;
        } else {
            while (m > 0) {
                n = m%10;
                sum = sum+n;
                m = m/10;
            }
        }
        System.out.println("Method 4: " + sum);

        //method 5
        int meth_5 = a*b*c*a_first;
        System.out.println("Method 5: " + meth_5);

        //method 6
        System.out.println("Method 6: " + b_last + meth_5);

    }
}
