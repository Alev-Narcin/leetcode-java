package org.example.solutions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SearchInsertSol {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target && target < nums[i + 1]) {
                return i + 1;
            } else if (target < nums[i]) {
                return i - 1;
            } else if (target > nums[nums.length - 1]) {
                return nums.length;
            }
        }
        return -9999;
    }

}
