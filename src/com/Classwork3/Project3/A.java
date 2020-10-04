package com.Project3;

import java.util.Scanner;
import java.util.Random;

public class A {

    public static void main(String[] args) {

        int[] m = new int[10];

        //method 1
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < m.length; i++) {
            System.out.println("Enter num " + (i+1) + ": ");
            int num = s.nextInt();

            m[i] = num;
        }

        //method 2
        Random r = new Random();

        for (int i = 0; i < m.length; i++) {
            int rand = r.nextInt(15);

            m[i] = rand;
        }

        //method 3-4
        int sum = 0;
        int mult = 1;

        for (int i = 0; i < m.length; i++) {
            if (m[i] < i) {
                sum = sum + m[i];
            } else if (m[i] > i){
                mult = mult * m[i];
            }
        }
        System.out.println("Method 3 : " + sum);
        System.out.println("Method 4 : " + mult);
    }
}