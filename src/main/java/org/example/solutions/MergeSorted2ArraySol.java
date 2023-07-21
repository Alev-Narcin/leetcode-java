package org.example.solutions;

import java.util.Arrays;

public class MergeSorted2ArraySol {
    public void mergeSorted2Array1(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

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
