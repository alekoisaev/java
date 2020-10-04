package com.Project3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {

        int[] m = new int[12];

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

            //method 3
            if (rand>7) {
                System.out.println(rand + " - " + i);
            }
        }

        //method 4
        Arrays.sort(m);

        int l = m.length;

        System.out.println(m[l-1] - m[0]);
    }
}
