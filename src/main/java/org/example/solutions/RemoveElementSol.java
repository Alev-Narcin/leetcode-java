package org.example.solutions;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementSol {
    public int removeElement(int[] arrs, int val) {
        List<Integer> newArrs = new ArrayList<>();

        for (int arr : arrs) {
            if (arr != val) {
                newArrs.add(arr);
            }
        }
        return newArrs.size();
    }
}
