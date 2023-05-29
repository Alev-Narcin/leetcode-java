package org.example.solutions;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesSol {
    List<Integer> arr2 = new ArrayList<>();
    public List<Integer> removeDuplicates(int[] value) {
        for (int i = 0; i < value.length; i++) {
            if (i == 0 || value[i - 1] != value[i]) {
                arr2.add(value[i]);
            }
        }
        return arr2;
    }

    public int removeDuplicates2(int[] value) {
        int i = 0;
        for (int j = 1; j < value.length; j++) {
            if (value[i] != value[j]) {
                i++;
                value[i] = value[j];
            }
        }
        return i + 1;
    }
}
