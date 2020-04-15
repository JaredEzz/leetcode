package com.cs340.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    int fst = nums[i];
                    int snd = nums[j];

                    if(fst+snd == target) return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
