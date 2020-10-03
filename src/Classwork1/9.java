package com.Classwork1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = {33, 45, 8, 65, 98, 105, 36};

        Arrays.sort(nums);

        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length - 1]);
    }
}
