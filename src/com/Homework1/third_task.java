package com.Homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class third_task {

    public static void main(String[] args) {

        //create some ints
        int a, b;
        int sum_even = 0;
        int sum_odd = 0;

        //create array
        int[] randNums = new int[40];


        Scanner s = new Scanner(System.in);
        Random r = new Random();

        // input a
        System.out.println("Enter A: ");
        a = s.nextInt();

        //input b
        System.out.println("Enter B: ");
        b = s.nextInt();


        if (a > b) {
            System.out.println("A > B");
            int temp;
            temp = a;
            a = b;
            b = temp;
        }

        //random limit for random nums
        int limit = (((b - a) + 1) + a);

        for (int i = 0; i < randNums.length; i++) {
            int num = r.nextInt(limit);
            randNums[i] = num;
        }

        //printing arrays of random nums
        System.out.println("Random nums: " + Arrays.toString(randNums));

        //checking for odd and even and add to array
        ArrayList<Integer> even_list = new ArrayList<>();
        ArrayList<Integer> odd_list = new ArrayList<>();
        for (int num: randNums) {
            if (num % 2 == 0) {
                even_list.add(num);
            } else {
                odd_list.add(num);
            }
        }

        //printing even and odd numbers
        System.out.println("Even nums count: " + even_list.size());
        System.out.println("Odd nums count: " + odd_list.size());

        //sum of evens
        for (int odds: odd_list) {
            sum_odd += odds;
        }

        for (int evens: even_list) {
            sum_even += evens;
        }

        //printing sum of evens and odds
        System.out.println("Sum of evens: " + sum_even);
        System.out.println("Sum of odds: " + sum_odd);


        // 5 random int from sum of evens and odds
        int[] rand_even = new int[5];
        int[] rand_odd = new int[5];

        for (int i = 0; i < 5; i++) {
            int num_even = r.nextInt(sum_even);
            int num_odd = r.nextInt(sum_odd);

            rand_even[i] = num_even;
            rand_odd[i] = num_odd;
        }

        System.out.println("5 Random num from even's sum: " + Arrays.toString(rand_even));
        System.out.println("5 Random num from odd's sum: " + Arrays.toString(rand_odd));

    }
}
