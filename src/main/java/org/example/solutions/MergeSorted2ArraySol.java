package org.example.solutions;

import java.util.Arrays;

public class MergeSorted2ArraySol {
    public void mergeSorted2Array(int[] nums1, int m, int[] nums2, int n) {
        int k = m;

        for (int i = 0; i < n; i++) {
            nums1[k] = nums2[i];
            k++;
        }
        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }
}
